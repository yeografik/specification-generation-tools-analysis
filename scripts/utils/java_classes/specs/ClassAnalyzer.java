package java_classes.specs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.type.Type;

public class ClassAnalyzer {

    private CompilationUnit cu;
    private ClassOrInterfaceDeclaration classDecl;
    private MethodDeclaration method;
    private Set<String> usedVarNames;
    private Map<String,Type> attributeTypes;

    public ClassAnalyzer(CompilationUnit cu, MethodDeclaration method, ClassOrInterfaceDeclaration classDecl) {
        this.cu = cu;
        this.classDecl = classDecl;
        this.method = method;
        usedVarNames = new HashSet<>();
        attributeTypes = new HashMap<>();
        setUsedVariableNames();
        setAttributeTypes();
    }

    public boolean isVoidMethod() {
        return method.getType().isVoidType();
    }

    public boolean hasCloneMethod() {
        List<MethodDeclaration> cloneMethods = classDecl.getMethodsByName("clone");
        return !cloneMethods.isEmpty();
    }

    public Type getAttributeType(String attribute) {
        return attributeTypes.get(attribute);
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
        while (usedVarNames.contains(finalName))
            finalName = baseName + "_" + num++;

        usedVarNames.add(finalName);
        return finalName;
    }

    private void setUsedVariableNames() {
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

    private void setAttributeTypes() {
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                attributeTypes.put(variable.getNameAsString(), variable.getType());
    }
}