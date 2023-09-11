package java_classes.specs;

import java.util.Map;
import java.util.Set;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

public class StatementInserter {

    private static Map<String, String> oldVarsReplacement;
    private static Set<String> oldVars;

    public static void setOldVariablesReferences(Map<String, String> oldVariablesReplacement, Set<String> oldVariables) {
        oldVarsReplacement = oldVariablesReplacement;
        oldVars = oldVariables;
    }

    public static int addParameterDuplication(NodeList<Statement> body, Parameter param, MethodAnalyzer mtAnalyzer) {
        String paramName = param.getNameAsString();
        oldVars.remove(paramName);
        String newName = mtAnalyzer.createNewVarName(paramName);
        insert(body, 0, param.getTypeAsString() + " " + newName + " = " + param.getNameAsString() + ";");
        oldVarsReplacement.put("\\old(" + paramName + ")", newName);
        
        return 1;
    }
//i + offset
    public static int addVarDeclDuplication(NodeList<Statement> body, ExpressionStmt exprStmt, int i, MethodAnalyzer mtAnalyzer) {
        int insertions = 0;
        Expression expr = exprStmt.getExpression();
        VariableDeclarationExpr varDeclExpr = expr.asVariableDeclarationExpr();
        for (VariableDeclarator var : varDeclExpr.getVariables()) {
            String varName = var.getNameAsString();
            if (oldVars.contains(varName) && var.getInitializer().isPresent()) {
                String newName = mtAnalyzer.createNewVarName(varName);
                insert(body, i + 1, newName + " = " + var.getInitializer() + ";");
                insertions++;
                setOldVarReplacement(varName, newName);
            }
        }

        return insertions;
    }
//i + offset
    public static int addVarAssignDuplication(NodeList<Statement> body, ExpressionStmt exprStmt, int i, MethodAnalyzer mtAnalyzer) {
        int insertions = 0;
        Expression expr = exprStmt.getExpression();
        String varName = expr.asAssignExpr().getTarget().toString();
        String newName = mtAnalyzer.createNewVarName(varName);
        insert(body, i + 1, newName + " = " + expr.asAssignExpr().getValue() + ";");
        insertions++;
        setOldVarReplacement(varName, newName);

        return insertions;
    }

    public static void addAssertAtBeginning(NodeList<Statement> body, int i, String preCondition) {
        insertAssertion(body, i, preCondition);
    }

    //i + offset
    public static int addAssertBeforeReturn(NodeList<Statement> body, ReturnStmt returnStmt, int i, int postCondIndex) {
        String postCond = SpecManipulator.toJavaFormat(returnStmt, postCondIndex, oldVarsReplacement);
        insertAssertion(body, i, postCond);
        //postCondIndex++;
        
        return 1;
    }

    private static void insertAssertion(NodeList<Statement> body, int pos, String condition) {
        if (condition.isEmpty()) 
            condition = "true";
        insert(body, pos, "assert (" + condition + ");");
    }
    
    private static void insert(NodeList<Statement> body, int pos, String statement) {
        Statement stmt = StaticJavaParser.parseStatement(statement);
        body.add(pos, stmt);
    }

    private static void setOldVarReplacement(String varName, String newName) {
        oldVars.remove(varName);
        oldVarsReplacement.put("\\old(" + varName + ")", newName);
    }
    
}