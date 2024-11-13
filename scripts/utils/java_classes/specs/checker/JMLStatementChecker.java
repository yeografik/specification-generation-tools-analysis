package java_classes.specs.checker;

import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;
import java_classes.specs.VariablesToDuplicate;

/**
 * The {@code JMLStatementChecker} class contains static methods that evaluate 
 * whether JavaParser AST nodes (such as statements, variable declarations, or expressions) 
 * meet certain conditions related to duplication and JML "old" syntax.
 * 
 * <p>This class centralizes logic for determining if certain statements or variables
 * should be considered for duplication based on specific criteria, such as "old" variable 
 * declarations and assignments.
 * 
 * <p>Note: To use the methods on this class, {@code VariablesToDuplicate}
 * must be set first using {@link #setVariablesToDuplicate(VariablesToDuplicate)}.
 */
public class JMLStatementChecker {

    private static VariablesToDuplicate variablesToDuplicate;

    /**
     * Sets the {@code VariablesToDuplicate} instance to be referenced when checking
     * for variables that require duplication.
     *
     * @param variables the {@code VariablesToDuplicate} instance
     */
    public static void setVariablesToDuplicate(VariablesToDuplicate variables) {
        variablesToDuplicate = variables;
    }

    /**
     * Determines if the provided statement is a variable declaration containing
     * a variable present in {@code VariablesToDuplicate}.
     *
     * @param s the statement to check
     * @return {@code true} if the statement contains a variable declaration present in {@code VariablesToDuplicate}; {@code false} otherwise
     */
    public static boolean isOldVarDeclaration(Statement s) {
        if (!JavaStatementChecker.isVariableDeclarationExpr(s))
            return false;

        VariableDeclarationExpr expression = getExpression(s).asVariableDeclarationExpr();
        return declarationContainsOldVariable(expression);
    }

    /**
     * Determines if the provided statement is an assignment involving an variable present in {@code VariablesToDuplicate}.
     *
     * @param s the statement to check
     * @return {@code true} if the statement contains an assignment to a variable present in {@code VariablesToDuplicate}; {@code false} otherwise
     */
    public static boolean isOldVarAssignment(Statement s) {
        if (!JavaStatementChecker.isAssignmentExpression(s))
            return false;

        AssignExpr expr = getExpression(s).asAssignExpr();
        String expressionTarget = expr.getTarget().toString();
        return isOldVariable(expressionTarget);
    }

    /**
     * Determines if the specified variable has an initializer and is present in {@code VariablesToDuplicate}.
     *
     * @param var the {@code VariableDeclarator} object
     * @return {@code true} if the variable has an initializer and is present in {@code VariablesToDuplicate}; {@code false} otherwise
     */
    public static boolean isOldVarInitialization(VariableDeclarator var) {
        String varName = var.getNameAsString();
        return isOldVariable(varName) && JavaStatementChecker.isInitialization(var);
    }

    /**
     * Checks if any variable within the given {@code VariableDeclarationExpr}
     * is an "old" variable that requires duplication. This method iterates through
     * each variable in the declaration to verify if it meets the criteria.
     *
     * @param expression the {@code VariableDeclarationExpr} to inspect
     * @return {@code true} if any variable in the declaration requires duplication; {@code false} otherwise
     */
    private static boolean declarationContainsOldVariable(VariableDeclarationExpr expression) {
        for (VariableDeclarator var : expression.getVariables()) {
            if (isOldVarInitialization(var))
                return true;
        }
        
        return false;
    }

    /**
     * Extracts the {@code Expression} from the provided {@code Statement}.
     * Assumes the statement is an {@code ExpressionStmt} and directly retrieves
     * the inner {@code Expression}.
     *
     * @param s the statement to retrieve the expression from
     * @return the {@code Expression} contained in the statement
     */
    private static Expression getExpression(Statement s) {
        return s.asExpressionStmt().getExpression();
    }

    /**
     * Determines if the specified variable name is an "old" variable
     * that should be duplicated according to the {@code VariablesToDuplicate}.
     *
     * @param variable the name of the variable to check
     * @return {@code true} if the variable is present in {@code VariablesToDuplicate}; {@code false} otherwise
     */
    private static boolean isOldVariable(String variable) {
        return variablesToDuplicate.containsVariable(variable);
    }
}




















