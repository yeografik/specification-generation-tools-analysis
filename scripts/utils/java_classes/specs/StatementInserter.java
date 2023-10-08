package java_classes.specs;

import java.util.HashMap;
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
import com.github.javaparser.ast.stmt.EmptyStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.Type;

public class StatementInserter {

    private ClassAnalyzer classAnalyzer;
    private Map<String, String> oldVarsReplacement;
    private Set<String> oldVars;

    public StatementInserter(Set<String> oldVars, ClassAnalyzer classAnalyzer) {
        this.oldVars = oldVars;
        this.classAnalyzer = classAnalyzer;
        this.oldVarsReplacement = new HashMap<>();
    }

    public void addParameterDuplication(NodeList<Statement> body, Parameter param) {
        String paramName = param.getNameAsString();
        oldVars.remove(paramName);
        String newName = classAnalyzer.createNewVarName(paramName);
        insert(body, 1, param.getTypeAsString() + " " + newName + " = " + param.getNameAsString() + ";");
        oldVarsReplacement.put("\\old(" + paramName + ")", newName);
    }

    public void addAttributeDuplication(NodeList<Statement> body, String expr) {
        String[] exprParts = expr.split("\\.");
        String newName = exprParts[0] + "_" + exprParts[exprParts.length -1];
        newName = classAnalyzer.createNewVarName(newName);
        
        Type type = classAnalyzer.getAttributeType(exprParts[exprParts.length -1]);
        if (type.isPrimitiveType())
            insert(body, 1, type.asString() + " " + newName + " = " + expr + ";");
        else
            insert(body, 1, "Object " + newName + " = " + expr + ";");
        oldVarsReplacement.put("\\old(" + expr + ")", newName);
    }

    public void addObjectRefDuplication(NodeList<Statement> body, String expr) {
        String[] exprParts = expr.split("\\.");
        String newName = classAnalyzer.createNewVarName(exprParts[0]);
        insert(body, 1, "Object " + newName + " = " + expr + ";");
        oldVarsReplacement.put("\\old(" + expr + ")", newName);
    }

    public void addObjectCloning(NodeList<Statement> body, String expr) {
        String[] exprParts = expr.split("\\.");
        String newName = exprParts[0] + "_" + exprParts[exprParts.length -1];
        newName = classAnalyzer.createNewVarName(newName);

        Type type = classAnalyzer.getAttributeType(exprParts[exprParts.length -1]);
        if (type == null) 
            throw new IllegalArgumentException("expression " + expr + " is a method call");
            
        insert(body, 1, type.asString() + " " + newName + " = " + expr + ".clone();");
        oldVarsReplacement.put("\\old(daikon.Quant.size(" + expr + "))", "daikon.Quant.size(" + newName + ")");
    }

    public int addVarDeclDuplication(NodeList<Statement> body, ExpressionStmt exprStmt, int i) {
        int insertions = 0;
        Expression expr = exprStmt.getExpression();
        VariableDeclarationExpr varDeclExpr = expr.asVariableDeclarationExpr();
        for (VariableDeclarator var : varDeclExpr.getVariables()) {
            String varName = var.getNameAsString();
            if (oldVars.contains(varName) && var.getInitializer().isPresent()) {
                String newName = classAnalyzer.createNewVarName(varName);
                insert(body, i + 1, newName + " = " + var.getInitializer() + ";");
                insertions++;
                putOldVarReplacement(varName, newName);
            }
        }

        return insertions;
    }

    public void addVarAssignDuplication(NodeList<Statement> body, ExpressionStmt exprStmt, int i) {
        Expression expr = exprStmt.getExpression();
        String varName = expr.asAssignExpr().getTarget().toString();
        String newName = classAnalyzer.createNewVarName(varName);
        insert(body, i + 1, newName + " = " + expr.asAssignExpr().getValue() + ";");
        putOldVarReplacement(varName, newName);
    }

    public void addAssertAtBeggining(NodeList<Statement> body, String condition) {
        insertAssertion(body, 0, condition);
    }

    public void addAssertBeforeReturn(NodeList<Statement> body, ReturnStmt returnStmt, int i, int postCondIndex) {
        String postCond = returnStmt.getExpression().get().toString();
        postCond = SpecManipulator.toJavaFormat(returnStmt, postCondIndex, oldVarsReplacement);
        insertAssertion(body, i, postCond);
    }

    public void addAssertAtEnd(NodeList<Statement> body, int postCondIndex) {
        String postCond = SpecManipulator.toJavaFormat(postCondIndex, oldVarsReplacement);
        insertAssertion(body, body.size(), postCond);
    }

    private void insertAssertion(NodeList<Statement> body, int pos, String condition) {
        if (condition.isEmpty()) 
            condition = "true";
        insert(body, pos, "assert (" + condition + ");");
    }
    
    private void insert(NodeList<Statement> body, int pos, String statement) {
        if (statement.contains("\\old(") || statement.contains("\\new(") || statement.contains("\\result")) {
            Statement emptyStmt = new EmptyStmt();
            body.add(pos, emptyStmt);
            body.get(pos).setBlockComment(statement);
        } else {
            Statement stmt = StaticJavaParser.parseStatement(statement);
            body.add(pos, stmt);
        }
    }

    private void putOldVarReplacement(String varName, String newName) {
        oldVars.remove(varName);
        oldVarsReplacement.put("\\old(" + varName + ")", newName);
    }
    
}