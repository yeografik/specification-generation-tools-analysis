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

    public static void main(String args[]) {
        if (args.length != 5)
            throw new IllegalArgumentException("Insufficient arguments provided\n");

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
        Statement preCond = StaticJavaParser.parseStatement("assert (" + args[3] + ");");
        body.getStatements().add(0, preCond); //add precondition at beginning
        
        Statement postCond = StaticJavaParser.parseStatement("assert (" + args[4] + ");");
        insertPostCondition(body.getStatements(), postCond); //insert postcondition before each return

        cu.getStorage().get().save();   //save file
    }

    private static void insertPostCondition(NodeList<Statement> body, Statement postCond) {
        int pos = 0;
        List<Integer> returnPos = new LinkedList<>();
        for (Statement s : body) {
            if (s instanceof ReturnStmt) //add postconditions before return
                returnPos.add(pos);
            else
                checkComplexStatement(s, postCond);
            pos++;
        }

        int insertions = 0;
        for (Integer i : returnPos) {
            body.add(i + insertions, postCond);
            insertions++;
        }
    }

    private static void checkComplexStatement(Statement s, Statement postCond) {
        if (s instanceof NodeWithStatements<?>)
            insertPostCondition(((NodeWithStatements<?>)s).getStatements(), postCond);
        else if (s instanceof NodeWithBody<?>)
            checkComplexStatement(((NodeWithBody<?>)s).getBody(), postCond);
        else if (s instanceof IfStmt)
            searchIfStmt((IfStmt)s, postCond);
        else if (s instanceof NodeWithBlockStmt<?>)
            insertPostCondition(((NodeWithBlockStmt<?>)s).getBody().getStatements(), postCond);
        else if (s instanceof TryStmt)
            insertPostCondition(((TryStmt)s).getTryBlock().getStatements(), postCond);
    }

    private static void searchIfStmt(IfStmt s, Statement postCond) {
        if(s.hasThenBlock())
            checkComplexStatement(s.getThenStmt(), postCond);

        Optional<Statement> elseStmt = s.getElseStmt();
        if(elseStmt.isPresent())
            checkComplexStatement(elseStmt.get(), postCond);
    }
}