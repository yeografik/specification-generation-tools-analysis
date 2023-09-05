import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithBody;
import com.github.javaparser.ast.NodeList;
import java.util.Optional;
import java.util.LinkedList;
import java.util.List;

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

        BlockStmt body = methodList.get(0).getBody().get();
        insert(body.getStatements(), 0, args[3]); //add precondition at beginning
        
        String[] postConds = arrangePostConditions(args);
        insertPostConditions(body.getStatements(), postConds); //insert postconditions before each return

        cu.getStorage().get().save();   //save file
    }

    private static void insert(NodeList<Statement> body, int pos, String condition) {
        if (condition.isEmpty()) 
            return;

        Statement cond = StaticJavaParser.parseStatement("assert (" + condition + ");");
        body.add(pos, cond);
    }

    private static String[] arrangePostConditions(String[] args) {
        int len = args.length - 4;
        String[] conds = new String[len];
        for (int i = 0; i < len; i++)
            conds[i] = args[i + 4];
            
        return conds;
    }
    
    private static void insertPostConditions(NodeList<Statement> body, String[] postConds) {
        int pos = 0;
        List<Integer> returnPos = new LinkedList<>();
        for (Statement s : body) {
            if (s instanceof ReturnStmt) //add postconditions before return
                returnPos.add(pos);
            else
                checkComplexStatement(s, postConds);
            pos++;
        }
        
        //insert post conditions in all the returns found in body
        int insertions = 0;
        for (Integer i : returnPos) {
            Statement returnStmt = body.get(i + insertions);
            postConds[postCondIndex] = formatNonJavaTerms(postConds[postCondIndex], returnStmt);
            insert(body, i + insertions, postConds[postCondIndex]);
            insertions++; postCondIndex++;
        }
    }
    
    private static void checkComplexStatement(Statement s, String[] postConds) {
        if (s instanceof NodeWithStatements<?>)
            insertPostConditions(((NodeWithStatements<?>)s).getStatements(), postConds);
        else if (s instanceof NodeWithBody<?>)
            checkComplexStatement(((NodeWithBody<?>)s).getBody(), postConds);
        else if (s instanceof IfStmt)
            searchIfStmt((IfStmt)s, postConds);
        else if (s instanceof NodeWithBlockStmt<?>)
            insertPostConditions(((NodeWithBlockStmt<?>)s).getBody().getStatements(), postConds);
        else if (s instanceof TryStmt)
            insertPostConditions(((TryStmt)s).getTryBlock().getStatements(), postConds);
        }

        private static void searchIfStmt(IfStmt s, String[] postConds) {
        if(s.hasThenBlock())
            checkComplexStatement(s.getThenStmt(), postConds);
        
        Optional<Statement> elseStmt = s.getElseStmt();
        if(elseStmt.isPresent())
            checkComplexStatement(elseStmt.get(), postConds);
    }
    
    private static String formatNonJavaTerms(String spec, Statement returnStmt) {
        if (!(returnStmt instanceof ReturnStmt))
            throw new IllegalArgumentException("Not a return statement, received " + returnStmt);
        
        ReturnStmt retStmt = (ReturnStmt) returnStmt;
        String returnBody = retStmt.getExpression().get().asNameExpr().toString();
        spec = spec.replace("\\result", returnBody);
        spec = spec.replace("\\old(x)", "1");
        
        return spec;
    }
}