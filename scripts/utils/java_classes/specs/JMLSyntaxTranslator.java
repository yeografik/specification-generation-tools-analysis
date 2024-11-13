package java_classes.specs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.javaparser.ast.stmt.ReturnStmt;

/**
 * The {@code JMLSyntaxTranslator} class acts as a bridge between JML (Java Modeling Language)
 * and standard Java code. This class is responsible for mapping JML-specific syntax,
 * such as old-value expressions (e.g., {@code \old(var)}), to the corresponding
 * Java variable names that store these values.
 *
 * <p>It maintains a mapping of original JML expressions to their Java replacements, enabling
 * seamless translation of JML assertions into Java assertions when inserting specifications.
 */
public class JMLSyntaxTranslator {

    private static Map<String,String> variableReplacements;
    private static VariablesToDuplicate variablesToDuplicate;
    private static Set<String> variablesToFlush;

    /**
     * Constructs a new {@code JMLSyntaxTranslator} with the provided set of variables to duplicate.
     *
     * @param varsToDuplicate the {@code VariablesToDuplicate} instance containing the variables
     *                        that need to be duplicated for JML translations
     */
    public JMLSyntaxTranslator(VariablesToDuplicate varsToDuplicate) {
        variableReplacements = new HashMap<>();
        variablesToDuplicate = varsToDuplicate;
        variablesToFlush = new HashSet<>();
    }

    /**
     * Updates the {@code VariablesToDuplicate} instance by removing any variables for which it's
     * translation has already been processed.
     */
    public void updateVariablesToDuplicate() {
        for (String var : variablesToFlush) {
            variablesToDuplicate.remove(var);
        }
        variablesToFlush.clear();
    }

    /**
     * Adds a new mapping from a JML expression to its corresponding Java replacement variable.
     *
     * @param original the original variable name in the JML expression
     * @param replacement the corresponding replacement variable name in Java
     */
    public void addReplacement(String original, String replacement) {
        String originalExpression = getAsOldExpression(original);
        variableReplacements.put(originalExpression, replacement);
        variablesToFlush.add(original);
    }

    /**
     * Adds a new mapping for a JML function applied to a variable, replacing it with
     * the corresponding function applied to the replacement variable in Java.
     *
     * @param original the original variable name in the JML expression
     * @param replacement the corresponding replacement variable name in Java
     * @param function the JML function to be applied (e.g., a method call)
     */
    public void addJMLFunctionReplacement(String original, String replacement, String function) {
        String originalFunction = RawCodeCreator.createFunctionCall(function, original);
        String replacementFunction = RawCodeCreator.createFunctionCall(function, replacement);
        
        originalFunction = getAsOldExpression(originalFunction);
        variableReplacements.put(originalFunction, replacementFunction);
        variablesToFlush.add(original);
    }

    /**
     * Converts a postcondition that may include JML syntax to its Java format by
     * replacing the {@code \result} keyword with the return expression.
     *
     * @param returnStmt the {@code ReturnStmt} representing the return statement of a method
     * @param postCondition the postcondition string potentially containing JML syntax
     * @return the postcondition with JML syntax replaced by Java equivalents
     */
    public String toJavaFormat(ReturnStmt returnStmt, String postCondition) {
        postCondition = replaceResultSyntax(returnStmt, postCondition);
        return toJavaFormat(postCondition);
    }

    /**
     * Translates JML syntax found in a postcondition string to its corresponding Java format.
     *
     * @param postCondition the postcondition string potentially containing JML syntax
     * @return the postcondition with JML syntax replaced by Java equivalents
     */
    public String toJavaFormat(String postCondition) {
        return replaceOldVariables(postCondition);
    }

    /**
     * Replaces occurrences of the {@code \result} keyword in a postcondition with the
     * return expression from the provided {@code ReturnStmt}.
     *
     * @param returnStmt the {@code ReturnStmt} representing the return statement of a method
     * @param postcondition the postcondition string to process
     * @return the postcondition with {@code \result} replaced by the return expression
     */
    private String replaceResultSyntax(ReturnStmt returnStmt, String postcondition) {
        String returnBody = returnStmt.getExpression().get().toString();
        postcondition = postcondition.replace("\\result", returnBody);
        return postcondition;
    }

    /**
     * Replaces all {@code \old(var)} occurrences in a postcondition string with their
     * corresponding Java variable names.
     *
     * @param postcondition the postcondition string to process
     * @return the postcondition with {@code \old(var)} replaced by Java variable names
     */
    private String replaceOldVariables(String postcondition) {
        for (Map.Entry<String, String> set : variableReplacements.entrySet())
            postcondition = postcondition.replace(set.getKey(), set.getValue());
        return postcondition;
    }

    /**
     * Formats a given expression to be recognized as a JML old-value expression.
     *
     * @param expr the expression to format
     * @return the expression wrapped as a JML old-value expression (e.g., {@code \old(expr)})
     */
    private String getAsOldExpression(String expr) {
        return "\\old(" + expr + ")";
    }
}