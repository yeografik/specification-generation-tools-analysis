package java_classes.specs;

import java.util.HashSet;
import java.util.Set;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;

/**
 * A utility class responsible for generating unique variable names within the context
 * of a specified subject class. The class ensures that newly generated names do not
 * conflict with existing attribute, parameter, or local variable names.
 */
public class NameGenerator {

    private static Set<String> usedVariableNames;
    private static SubjectClass subjectClass;

    /**
     * Sets the current subject class context for the name generator.
     *
     * <p>This method initializes the set of used variable names based on
     * the attributes, method parameters, and local variables present
     * in the provided subject class for the subject method.
     *
     * @param subject the {@code SubjectClass} to set as the current context
     */
    public static void setSubjectClass(SubjectClass subject) {
        subjectClass = subject;
        setUsedVariableNames();
    }

    /**
     * Generates a unique variable name based on the given variable name.
     *
     * <p>This method ensures that the generated name does not conflict with
     * any pre-existing names in the context of the current subject method.
     *
     * @param var the base name for the variable
     * @return a unique variable name as a string
     */
    public static String newVariableNameFor(String var) {
        String baseName = "old_" + var;
        String finalName = findUsableName(baseName);
        usedVariableNames.add(finalName);

        return finalName;
    }

    /**
     * Generates a unique variable name based on an array of expression components.
     *
     * <p>Combines parts of the given array to create a base name and generates a
     * unique variable name from it.
     *
     * @param expr an array of strings representing parts of an expression
     * @return a unique variable name as a string
     */
    public static String newVariableNameFor(String[] expr) {
        String partialName = buildPartialName(expr);
        return newVariableNameFor(partialName);
    }

    /**
     * Builds a partial variable name from an array of expression components.
     *
     * @param expression an array of strings representing parts of an expression
     * @return a partial variable name as a string
     */
    private static String buildPartialName(String[] expression) {
        int start = 0, last = expression.length -1;
        return expression[start] + "_" + expression[last];
    }

    /**
     * Finds an available variable name by appending a numeric suffix if necessary.
     *
     * <p>Starts with a base name and appends incrementing numbers until a unique
     * name is found.
     *
     * @param baseName the initial name to use as a base
     * @return a unique variable name as a string
     */
    private static String findUsableName(String baseName) {
        String finalName = baseName;
        int num = 1;
        while (usedVariableNames.contains(finalName))
            finalName = baseName + "_" + num++;

        return finalName;
    }

    /**
     * Initializes the set of used variable names for the current subject class and subject method.
     *
     * <p>Collects attribute names, method parameter names, and local variable names
     * to prevent naming conflicts when generating new variable names.
     */
    private static void setUsedVariableNames() {
        usedVariableNames = new HashSet<>();
        collectAttributeNames();
        collectParameterNames();
        collectVariableNames();
    }

    /**
     * Collects all attribute names from the current subject class.
     */
    private static void collectAttributeNames() {
        CompilationUnit cu = subjectClass.getCompilationUnit();
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                usedVariableNames.add(variable.getNameAsString());
    }

    /**
     * Collects all parameter names from the current subject method of the subject class.
     */
    private static void collectParameterNames() {
        MethodDeclaration method = subjectClass.getMethod();
        for (Parameter p : method.getParameters())
            usedVariableNames.add(p.getNameAsString());
    }

    /**
     * Collects all local variable names from the current subject method of the subject class.
     */
    private static void collectVariableNames() {
        MethodDeclaration method = subjectClass.getMethod();
        for (VariableDeclarationExpr varDeclaration : method.findAll(VariableDeclarationExpr.class))
            for (VariableDeclarator var : varDeclaration.getVariables())
                usedVariableNames.add(var.getNameAsString());
    }
}