package java_classes.specs;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;

public class MethodAnalyzer {

    private CompilationUnit cu;
    private MethodDeclaration method;
    private Set<String> usedVarNames;

    public MethodAnalyzer(CompilationUnit cu, MethodDeclaration method) {
        this.cu = cu;
        this.method = method;
        usedVarNames = new HashSet<>();
        searchUsedVariableNames();
    }

    public NodeList<Parameter> getParameters() {
        return method.getParameters();
    }

    public BlockStmt getBody() {
        Optional<BlockStmt> blockStmt = method.getBody();
        if (!blockStmt.isPresent()) 
            throw new IllegalArgumentException("Method " + method + " has no body");

        return blockStmt.get();
    }

    public String createNewVarName(String var) {
        String baseName = "old_" + var;
        String finalName = baseName;
        int num = 1;
        while (usedVarNames.contains(finalName)) {
            finalName = baseName + "_" + num++;
        }

        return finalName;
    }

    private void searchUsedVariableNames() {
        //class attributes
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                usedVarNames.add(variable.getNameAsString());
        
        //method parameters
        for (Parameter p : method.getParameters())
            usedVarNames.add(p.getNameAsString());
        
        //method variables
        for (VariableDeclarationExpr varDecl : method.findAll(VariableDeclarationExpr.class)) {
            for (VariableDeclarator var : varDecl.getVariables()) {
                usedVarNames.add(var.getNameAsString());
            }
        }
    }
}