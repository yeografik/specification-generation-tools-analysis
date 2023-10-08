package java_classes.specs;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;

public class StatementChecker {

    public static boolean isOldVarDeclaration(Statement s, Set<String> oldVars) {
        if (!isVarDeclarationExpr(s))
            return false;

        Expression expr = s.asExpressionStmt().getExpression();
        VariableDeclarationExpr varDeclExpr = expr.asVariableDeclarationExpr();
        for (VariableDeclarator var : varDeclExpr.getVariables())
            if (var.getInitializer().isPresent() && oldVars.contains(var.getNameAsString()))
                return true;
        
        return false;
    }

    public static boolean isOldVarAssignment(Statement s, Set<String> oldVars) {
        if (!isVarAssignment(s))
            return false;

        Expression expr = s.asExpressionStmt().getExpression();
        return expr.isAssignExpr() && oldVars.contains(expr.asAssignExpr().getTarget().toString());
    }
    
    public static boolean isAttributeCall(String expression) {
        if (expression.equals("this"))
            return false;

        Matcher m = Pattern.compile("[a-zA-Z_$0-9]+$").matcher(expression);
        return m.find();
    }
    
    private static boolean isVarDeclarationExpr(Statement s) {
        if (!s.isExpressionStmt())
            return false;

        Expression expr = s.asExpressionStmt().getExpression();
        return expr.isVariableDeclarationExpr(); 
    }

    private static boolean isVarAssignment(Statement s) {
        if (!s.isExpressionStmt())
            return false;

        Expression expr = s.asExpressionStmt().getExpression();
        return expr.isAssignExpr();
    }

}