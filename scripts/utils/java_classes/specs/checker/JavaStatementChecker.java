package java_classes.specs.checker;

import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;
import java_classes.specs.patern_matcher.JavaPatternMatcher;

/**
 * Utility class for checking specific characteristics of Java statements and expressions.
 *
 * <p>This class provides static methods to check if a statement or expression meets certain conditions,
 * such as being a variable declaration, assignment or class attribute. It also includes helper methods for
 * determining initialization presence in variables.
 */
public class JavaStatementChecker {

    /**
     * Determines if the provided expression string matches an attribute reference pattern.
     *
     * @param expression the expression string to check
     * @return {@code true} if the expression is an attribute reference (but not to "this"); {@code false} otherwise
     */
    public static boolean isAttributeReference(String expression) {
        if (isReferenceToThis(expression))
            return false;

        return JavaPatternMatcher.matchAttributePattern(expression);
    }

    /**
     * Checks if the given statement is an assignment expression.
     *
     * @param s the statement to check
     * @return {@code true} if the statement is an assignment expression; {@code false} otherwise
     */
    public static boolean isAssignmentExpression(Statement s) {
        return isExpressionStatementOfType(s, AssignExpr.class);
    }

    /**
     * Checks if the provided statement is a variable declaration expression.
     *
     * @param s the statement to check
     * @return {@code true} if the statement is a variable declaration expression; {@code false} otherwise
     */
    public static boolean isVariableDeclarationExpr(Statement s) {
        return isExpressionStatementOfType(s, VariableDeclarationExpr.class);
    }

    /**
     * Checks if the given variable declarator has an initializer.
     *
     * @param var the variable declarator to check
     * @return {@code true} if the variable declarator has an initializer; {@code false} otherwise
     */
    public static boolean isInitialization(VariableDeclarator var) {
        return var.getInitializer().isPresent();
    }

    /**
     * Checks if the provided statement is an expression and instance of the provided type.
     *
     * @param s the statement to check
     * @param type the type to check instance
     * @return {@code true} if the statement is an expression of the given type; {@code false} otherwise
     */
    private static boolean isExpressionStatementOfType(Statement s, Class<? extends Expression> type) {
        if (!s.isExpressionStmt())
            return false;

        Expression expr = getExpression(s);
        return type.isInstance(expr);
    }

    /**
     * Checks if the provided expression string is a reference to "this".
     *
     * @param expression the expression string to check
     * @return {@code true} if the expression is "this"; {@code false} otherwise
     */
    private static boolean isReferenceToThis(String expression) {
        return expression.equals("this");
    }

    /**
     * Retrieves the expression contained within the given statement.
     *
     * @param s the statement from which to retrieve the expression
     * @return the expression contained in the statement
     * @throws IllegalArgumentException if the statement is not an expression statement
     */
    private static Expression getExpression(Statement s) {
        return s.asExpressionStmt().getExpression();
    }
}