package java_classes.specs;

import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithBody;
import com.github.javaparser.ast.NodeList;
import java.util.Optional;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/*
 * Inserts given assertion before return statement in the given method
 * arg 0: path to java class
 * arg 1: class name
 * arg 2: method name
 * arg 3: precondition to insert
 * arg 4: postcondition to insert
 */
public class AssertionInserter {

    private static final int minArgs = 5;
    private static int postCondIndex = 0;
    private static SpecManipulator spcMpl;
    private static ClassAnalyzer classAnalyzer;
    private static StatementInserter stmtInserter;

    public static void main(String args[]) {
        if (args.length < minArgs)
            throw new IllegalArgumentException("Insufficient arguments provided, expected at least " + minArgs + ", but received " + args.length + "\n");

        CompilationUnit cu;
        try {
          cu = StaticJavaParser.parse(new File(args[0])); //JavaFile.java
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File " + args[0] + " doesn't exists");
        }
        Optional<ClassOrInterfaceDeclaration> subjectClass = cu.getClassByName(args[1]);
        if (!subjectClass.isPresent()) 
            throw new IllegalArgumentException("Class " + args[1] + " doesn't exists\n");
        List<MethodDeclaration> methodList = subjectClass.get().getMethodsByName(args[2]);
        if (methodList.isEmpty()) 
            throw new IllegalArgumentException("Method " + args[2] + " doesn't exists\n");
        
        spcMpl = new SpecManipulator(Arrays.copyOfRange(args, 3, args.length));
        classAnalyzer = new ClassAnalyzer(cu, methodList.get(0), subjectClass.get());
        stmtInserter = new StatementInserter(spcMpl.getOldVariables(), classAnalyzer);

        BlockStmt body = classAnalyzer.getBody();
        stmtInserter.addAssertAtBeggining(body.getStatements(), spcMpl.getPreCondition());
        
        insertPostConditions(body.getStatements(), classAnalyzer.getParameters()); //insert postconditions before each return

        cu.getStorage().get().save();   //save file
    }

    private static void insertPostConditions(NodeList<Statement> body, NodeList<Parameter> parameters) {
        //duplicate parameters
        Set<String> oldVars = spcMpl.getOldVariables();
        for (Parameter p : parameters)
            if (oldVars.contains(p.getNameAsString()))
                stmtInserter.addParameterDuplication(body, p);

        //duplicate attributes
        Set<String> oldRefs = spcMpl.getOldReferences();
        for (String ref : oldRefs)
            if (StatementChecker.isAttributeCall(ref))
                stmtInserter.addAttributeDuplication(body, ref);
            else 
                stmtInserter.addObjectRefDuplication(body, ref);

        //clone required references
        Set<String> varsToClone = spcMpl.getCloneRequiredOldRefs();
        // if (!varsToClone.isEmpty() && !classAnalyzer.hasCloneMethod())
        //     throw new IllegalStateException("Specs require clone method, but class doesn't have it");
        
        for (String ref : varsToClone)
            stmtInserter.addObjectCloning(body, ref);

        traverseStatements(body);

        if (classAnalyzer.isVoidMethod())
            stmtInserter.addAssertAtEnd(body, 0);
    }

    private static void traverseStatements(NodeList<Statement> body) {
        int pos = 0;
        Set<String> oldVars = spcMpl.getOldVariables();
        List<Integer> insertionPositions = new LinkedList<>();
        for (Statement s : body) {
            if (StatementChecker.isOldVarAssignment(s, oldVars) 
             || StatementChecker.isOldVarDeclaration(s, oldVars)) 
                insertionPositions.add(pos); //add new var with old value of var
            else if (s.isReturnStmt()) //add postconditions before return
                insertionPositions.add(pos);
            else
                checkComplexStatement(s);
            pos++;
        }
        
        //insert post conditions in all the returns found in body
        int insertions = 0;
        for (Integer i : insertionPositions) {
            Statement stmt = body.get(i + insertions);
            if (stmt.isReturnStmt())
                stmtInserter.addAssertBeforeReturn(body, stmt.asReturnStmt(), i + insertions++, postCondIndex++);
            else if (StatementChecker.isOldVarAssignment(stmt, oldVars))
                stmtInserter.addVarAssignDuplication(body, stmt.asExpressionStmt(), i + insertions++);
            else if (StatementChecker.isOldVarDeclaration(stmt, oldVars))
                insertions += stmtInserter.addVarDeclDuplication(body, stmt.asExpressionStmt(), i + insertions);
            else 
                throw new IllegalStateException("Invalid statement in insertion list: " + stmt);
        }
    }

    private static void checkComplexStatement(Statement s) {
        if (s instanceof NodeWithStatements<?>)
            traverseStatements(((NodeWithStatements<?>)s).getStatements());
        else if (s instanceof NodeWithBody<?>)
            checkComplexStatement(((NodeWithBody<?>)s).getBody());
        else if (s.isIfStmt())
            searchIfStmt(s.asIfStmt());
        else if (s instanceof NodeWithBlockStmt<?>)
            traverseStatements(((NodeWithBlockStmt<?>)s).getBody().getStatements());
        else if (s.isTryStmt())
            traverseStatements(s.asTryStmt().getTryBlock().getStatements());
    }

    private static void searchIfStmt(IfStmt s) {
        if(s.hasThenBlock())
            checkComplexStatement(s.getThenStmt());
        
        Optional<Statement> elseStmt = s.getElseStmt();
        if(elseStmt.isPresent())
            checkComplexStatement(elseStmt.get());
    }
}
