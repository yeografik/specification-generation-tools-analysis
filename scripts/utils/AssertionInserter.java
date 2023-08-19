import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import java.util.Optional;
import java.util.List;

/*
 * Inserts given assertion before return statement in the given method
 * arg 0: path to java class
 * arg 1: class name
 * arg 2: method name
 * arg 3: condition to insert
 */
public class AssertionInserter {

    public static void main(String args[]) {

        if (args.length != 4)
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
        Statement assertStmt = StaticJavaParser.parseStatement("assert (" + args[3] + ");");
        
        int methodSize = body.getStatements().size(); 
        body.getStatements().add(methodSize - 1, assertStmt); //add assert before return

        methodList.get(0).setBody(body);
        cu.getStorage().get().save();   //save file
    }
}