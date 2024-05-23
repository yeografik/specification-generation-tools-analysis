package java_classes.specs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.Type;

public class SubjectClass {

    private CompilationUnit cu;
    private ClassOrInterfaceDeclaration classDeclaration;
    private MethodDeclaration subjectMethod;
    private Map<String,Type> attributeTypes;

    public SubjectClass(String pathToClass, String className, String methodName) {
        setCompilationUnit(pathToClass);
        setSubjectClass(className);
        setMethod(methodName);
        setAttributeTypes();
    }

    public CompilationUnit getCompilationUnit() {
        return cu;
    }

    public ClassOrInterfaceDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public MethodDeclaration getMethod() {
        return subjectMethod;
    }
    
    public Type getMethodType() {
        return subjectMethod.getType();
    }

    public boolean isVoidMethod() {
        return subjectMethod.getType().isVoidType();
    }
    
    public boolean hasCloneMethod() {
        List<MethodDeclaration> cloneMethods = classDeclaration.getMethodsByName("clone");
        return !cloneMethods.isEmpty();
    }

    public Type getAttributeType(String attribute) {
        return attributeTypes.get(attribute);
    }

    public NodeList<Parameter> getParameters() {
        return subjectMethod.getParameters();
    }

    public NodeList<Statement> getMethodBody() {
        Optional<BlockStmt> blockStmt = subjectMethod.getBody();
        if (!blockStmt.isPresent()) 
            throw new IllegalArgumentException("Method " + subjectMethod + " has no body");
        
        BlockStmt body = blockStmt.get();
        return body.getStatements();
    }

    private void setCompilationUnit(String pathToClass) {
        try {
            cu = StaticJavaParser.parse(new File(pathToClass)); //File.java
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File " + pathToClass + " doesn't exists");
        }
    }
    
    private void setSubjectClass(String className) {
        Optional<ClassOrInterfaceDeclaration> targetClass = cu.getClassByName(className);
        if (!targetClass.isPresent()) 
            throw new IllegalArgumentException("Class " + className + " doesn't exists\n");
        else
            classDeclaration = targetClass.get();
    }

    private void setMethod(String methodName) {
        List<MethodDeclaration> methodList = classDeclaration.getMethodsByName(methodName);
        if (methodList.isEmpty()) 
            throw new IllegalArgumentException("Method " + methodName + " doesn't exists\n");
        else
            subjectMethod = methodList.get(0);
    }

    private void setAttributeTypes() {
        attributeTypes = new HashMap<>();
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                attributeTypes.put(variable.getNameAsString(), variable.getType());
    }
}