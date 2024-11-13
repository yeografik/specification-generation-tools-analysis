package java_classes.specs.patern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for pattern matching Java expressions.
 *
 * <p>This class provides methods to detect if an expression matches a specified
 * pattern (e.g., simple identifiers like variable names, attributes).
 */
public class JavaPatternMatcher {

    private static final String ATTRIBUTE_PATTERN = "[a-zA-Z_$0-9]+$";

    /**
     * Checks if the given expression matches a Java attribute pattern.
     *
     * @param expression the expression to check for the attribute pattern
     * @return {@code true} if the expression matches the attribute pattern, {@code false} otherwise
     */
    public static boolean matchAttributePattern(String expression) {
        Matcher m = Pattern.compile(ATTRIBUTE_PATTERN).matcher(expression);
        return m.find();
    }
}