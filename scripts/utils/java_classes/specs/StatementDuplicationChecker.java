package java_classes.specs;

import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;

//TODO: find a better name, Utils? StatementsToCopyChecker? other name
public class StatementDuplicationChecker {

    private static VariablesToDuplicate variablesToDuplicate;

    public static void setVariablesToDuplicate(VariablesToDuplicate variables) {
        variablesToDuplicate = variables;
    }

    public static boolean isOldVarDeclaration(Statement s) {
        if (!isVariableDeclarationExpr(s))
            return false;

        VariableDeclarationExpr expression = getExpression(s).asVariableDeclarationExpr();
        return containsOldVariableDeclaration(expression);
    }

    public static boolean isOldVarAssignment(Statement s) {
        if (!isAssignmentExpression(s))
            return false;

        AssignExpr expr = getExpression(s).asAssignExpr();
        return isOldVariable(expr);
    }
    
    public static boolean isOldVarInitializer(String varName, VariableDeclarator var) {
        return variablesToDuplicate.containsVariable(varName) 
            && var.getInitializer().isPresent();
    }
    
    // TODO: this method has nothing to do with variables to duplicate
    // it should be somewere else
    public static boolean isAttributeReference(String expression) {
        if (isReferenceToThis(expression))
            return false;

        return DaikonPatternMatcher.hasAttributePattern(expression);
    }
    
    private static boolean isVariableDeclarationExpr(Statement s) {
        if (!s.isExpressionStmt())
            return false;

        Expression expr = getExpression(s);
        return expr.isVariableDeclarationExpr(); 
    }

    private static boolean isAssignmentExpression(Statement s) {
        if (!s.isExpressionStmt())
            return false;

        Expression expr = getExpression(s);
        return expr.isAssignExpr();
    }

    private static boolean containsOldVariableDeclaration(VariableDeclarationExpr expression) {
        for (VariableDeclarator var : expression.getVariables())
            if (isDeclaration(var))
                return true;
        
        return false;
    }

    private static boolean isDeclaration(VariableDeclarator var) {
        return isInitilization(var) && needsDuplicate(var);
    }

    private static boolean isInitilization(VariableDeclarator var) {
        return var.getInitializer().isPresent();
    }

    private static boolean needsDuplicate(VariableDeclarator var) {
        String variable = var.getNameAsString();
        return variablesToDuplicate.containsVariable(variable);
    }
    
    private static Expression getExpression(Statement s) {
        return s.asExpressionStmt().getExpression();
    }

    private static boolean isOldVariable(AssignExpr expr) {
        String expression = expr.getTarget().toString();
        return variablesToDuplicate.containsVariable(expression);
    }

    private static boolean isReferenceToThis(String expression) {
        return expression.equals("this");
    }
}