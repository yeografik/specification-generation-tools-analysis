package java_classes.specs.patern_matcher;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for identifying and extracting JML {@code \old} expressions in specifications.
 *
 * <p>This class provides methods to locate and extract variable names, references, and arguments
 * for daikon functions within specifications that use JML's {@code \old} syntax. It can differentiate
 * between basic variables, object references, and daikon function calls within {@code \old} expressions.
 */
public class JMLPatternMatcher {

    private static final String OLD_VARIABLE_PATTERN = "\\\\old\\([a-z_$][a-zA-Z_$0-9]*\\)";
    private static final String OLD_REFERENCE_PATTERN = "\\\\old\\([a-z_$][a-zA-Z_$0-9]*(\\.[a-zA-Z_$0-9]+(\\([^\\)]*\\))?)+\\)";
    private static final String OLD_DAIKON_CALL_PATTERN = "\\\\old\\(daikon\\.Quant\\.size\\([a-zA-Z_$0-9]+(\\.[a-zA-Z_$0-9]+)*\\)\\)";

    /**
     * Finds all simple variables within {@code \old} expressions in the given specification.
     *
     * @param specs the JML specification to search for {@code \old} expressions
     * @return a set of variable names found within {@code \old} expressions
     */
    public static Set<String> matchOldVariables(String specs) {
        Set<String> oldVariables = new HashSet<>();
        Matcher m = Pattern.compile(OLD_VARIABLE_PATTERN).matcher(specs);
        while(m.find()) {
            String matchingExpression = m.group();
            String variableName = extractVariableName(matchingExpression);
            oldVariables.add(variableName);
        }

        return oldVariables;
    }

    /**
     * Finds all references, such as fields or method calls, within {@code \old} expressions.
     *
     * <p>Ignores references that contain "daikon" since they are handled separately.
     *
     * @param specs the JML specification to search for {@code \old} expressions with references
     * @return a set of reference expressions found within {@code \old} expressions
     */
    public static Set<String> matchOldReferences(String specs) {
        Set<String> oldReferences = new HashSet<>();
        Matcher m = Pattern.compile(OLD_REFERENCE_PATTERN).matcher(specs);
        while(m.find()) {
            String matchingExpression = m.group();
            if (matchingExpression.contains("daikon")) 
                continue;
            String reference = extractReferenceExpression(matchingExpression);
            oldReferences.add(reference);
        }

        return oldReferences;
    }

    /**
     * Finds all daikon function calls in {@code \old} expressions, specifically function calls
     * to "daikon.Quant.size" function.
     *
     * @param specs the JML specification to search for {@code \old} expressions containing
     *              arguments of daikon functions
     * @return a set of function expressions matching {@code \old(daikon.Quant.size(...))}
     */
    public static Set<String> matchOldDaikonFunction(String specs) {
        Set<String> oldDaikonArguments = new HashSet<>();
        Matcher m = Pattern.compile(OLD_DAIKON_CALL_PATTERN).matcher(specs);
        while(m.find()) {
            String matchingExpression = m.group();
            String daikonArgument = extractFunctionArgument(matchingExpression);
            oldDaikonArguments.add(daikonArgument);
        }

        return oldDaikonArguments;
    }

    /**
     * Extracts a variable name from a simple {@code \old} expression.
     *
     * @param expression the {@code \old} expression containing a variable name
     * @return the variable name extracted from the expression
     */
    private static String extractVariableName(String expression) {
        return expression.replace("\\old(", "").replace(")", "");
    }

    /**
     * Extracts a reference expression, such as a field or method call, from a {@code \old} expression.
     *
     * @param expression the {@code \old} expression containing a reference
     * @return the reference expression extracted from the {@code \old} expression
     */
    private static String extractReferenceExpression(String expression) {
        return expression.replace("\\old(", "").replaceAll("\\)$", "");
    }

    /**
     * Extracts the function argument from a daikon function call inside an {@code \old} expression,
     * specifically for the "daikon.Quant.size(...)" function.
     *
     * @param expression the {@code \old} expression containing an argument inside a daikon function
     * @return the argument within the function call of the {@code \old} expression
     */
    private static String extractFunctionArgument(String expression) {
        return expression.replace("\\old(daikon.Quant.size(", "").replace("))", "");
    }
}