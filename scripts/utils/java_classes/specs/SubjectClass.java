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

/**
 * The {@code SubjectClass} class represents a source code class and its method within a specified file.
 * This class initializes based on the path to the class source file, class name and method name, it also
 * provides functionality to parse, retrieve, and analyze attributes, methods, and other structural 
 * elements within the specified class.
 * 
 * <p>This class throws {@code IllegalArgumentException} if the specified class or method 
 * does not exist in the provided source file, or if the file itself cannot be found.
 */
public class SubjectClass {

    private CompilationUnit cu;
    private ClassOrInterfaceDeclaration classDeclaration;
    private MethodDeclaration subjectMethod;
    private Map<String, Type> attributeTypes;

    /**
     * Constructs a {@code SubjectClass} instance, initializing the compilation unit, 
     * class declaration, method, and attribute types based on the provided source file path.
     *
     * @param pathToClass the file path to the source file containing the class
     * @param className the name of the target class within the file
     * @param methodName the name of the method within the class
     * @throws IllegalArgumentException if the file, class, or method is not found
     */
    public SubjectClass(String pathToClass, String className, String methodName) {
        setCompilationUnit(pathToClass);
        setSubjectClass(className);
        setMethod(methodName);
        setClassAttributeTypes();
    }

    /**
     * Returns the parsed {@code CompilationUnit} object.
     *
     * @return the compilation unit
     */
    public CompilationUnit getCompilationUnit() {
        return cu;
    }

    /**
     * Returns the {@code ClassOrInterfaceDeclaration} of the target class.
     *
     * @return the class or interface declaration
     */
    public ClassOrInterfaceDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    /**
     * Returns the {@code MethodDeclaration} of the target method within the class.
     *
     * @return the method declaration
     */
    public MethodDeclaration getMethod() {
        return subjectMethod;
    }

    /**
     * Returns the type of the target method.
     *
     * @return the method's return type
     */
    public Type getMethodType() {
        return subjectMethod.getType();
    }

    /**
     * Checks if the target method has a void return type.
     *
     * @return {@code true} if the method is void, {@code false} otherwise
     */
    public boolean isVoidMethod() {
        return subjectMethod.getType().isVoidType();
    }

    /**
     * Checks if the target class contains a {@code clone} method.
     *
     * @return {@code true} if a clone method exists, {@code false} otherwise
     */
    public boolean hasCloneMethod() {
        List<MethodDeclaration> cloneMethods = classDeclaration.getMethodsByName("clone");
        return !cloneMethods.isEmpty();
    }

    /**
     * Returns the type of a specified class attribute.
     *
     * @param attribute the name of the attribute
     * @return the type of the specified attribute, or {@code null} if not found
     */
    public Type getAttributeType(String attribute) {
        return attributeTypes.get(attribute);
    }

    /**
     * Returns the parameters of the target method.
     *
     * @return the parameters of the method
     */
    public NodeList<Parameter> getParameters() {
        return subjectMethod.getParameters();
    }

    /**
     * Returns the statements within the target method's body.
     *
     * @return a {@code NodeList} of statements in the method body
     * @throws IllegalArgumentException if the method has no body
     */
    public NodeList<Statement> getMethodBody() {
        Optional<BlockStmt> blockStmt = subjectMethod.getBody();
        if (!blockStmt.isPresent())
            throw new IllegalArgumentException("Method " + subjectMethod.getName() + " has no body");
        
        BlockStmt body = blockStmt.get();
        return body.getStatements();
    }

    /**
     * Parses and sets the {@code CompilationUnit} from a file path.
     *
     * @param pathToClass the file path of the class source file
     * @throws IllegalArgumentException if the file is not found
     */
    private void setCompilationUnit(String pathToClass) {
        try {
            cu = StaticJavaParser.parse(new File(pathToClass));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File at path '" + pathToClass + "' does not exist");
        }
    }

    /**
     * Sets the target {@code ClassOrInterfaceDeclaration} based on the class name.
     *
     * @param className the name of the class to set
     * @throws IllegalArgumentException if the class is not found in the compilation unit
     */
    private void setSubjectClass(String className) {
        Optional<ClassOrInterfaceDeclaration> targetClass = cu.getClassByName(className);
        if (!targetClass.isPresent())
            throw new IllegalArgumentException("Class '" + className + "' does not exist in the provided file");
        
        classDeclaration = targetClass.get();
    }

    /**
     * Sets the target {@code MethodDeclaration} based on the method name.
     *
     * @param methodName the name of the method to set
     * @throws IllegalArgumentException if the method is not found in the class declaration
     */
    private void setMethod(String methodName) {
        List<MethodDeclaration> methodList = classDeclaration.getMethodsByName(methodName);
        if (methodList.isEmpty()) 
            throw new IllegalArgumentException("Method '" + methodName + "' does not exist in the class");
        
        subjectMethod = methodList.get(0);
    }

    /**
     * Populates {@code attributeTypes} with the declared attributes of the class, 
     * mapping attribute names to their types.
     */
    private void setClassAttributeTypes() {
        attributeTypes = new HashMap<>();
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                attributeTypes.put(variable.getNameAsString(), variable.getType());
    }
}