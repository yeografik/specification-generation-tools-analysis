package java_classes.specs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.javaparser.ast.stmt.ReturnStmt;

public class DaikonSyntaxTranslator {

    private static Map<String,String> variableReplacements;
    private static VariablesToDuplicate variablesToDuplicate;
    private static Set<String> variablesToFlush;

    public DaikonSyntaxTranslator(VariablesToDuplicate varsToDuplicate) {
        variableReplacements = new HashMap<>();
        variablesToDuplicate = varsToDuplicate;
        variablesToFlush = new HashSet<>();
    }

    public void updateVariablesToDuplicate() {
        for (String var : variablesToFlush) {
            variablesToDuplicate.remove(var);
        }
    }

    public void addReplacement(String original, String replacement) {
        String originalExpression = getOldExpression(original);
        variableReplacements.put(originalExpression, replacement);
        variablesToFlush.add(original);
    }

    public void addDaikonFunctionReplacement(String original, String replacement, String function) {
        String originalFunction = RawCodeCreator.createFunctionCall(function, original);
        String replacementFunction = RawCodeCreator.createFunctionCall(function, replacement);
        
        originalFunction = getOldExpression(originalFunction);
        variableReplacements.put(originalFunction, replacementFunction);
        variablesToFlush.add(original);
    }

    public String toJavaFormat(ReturnStmt returnStmt, String postCondition) {
        postCondition = replaceResultSyntax(returnStmt, postCondition);
        return toJavaFormat(postCondition);
    }

    public String toJavaFormat(String postCondition) {
        postCondition = replaceOldVariables(postCondition);
        return postCondition;
    }

    private String replaceResultSyntax(ReturnStmt returnStmt, String postcondition) {
        String returnBody = returnStmt.getExpression().get().toString();
        postcondition = postcondition.replace("\\result", returnBody);
        return postcondition;
    }

    private String replaceOldVariables(String postcondition) {
        for (Map.Entry<String, String> set : variableReplacements.entrySet())
            postcondition = postcondition.replace(set.getKey(), set.getValue());
        return postcondition;
    }

    private String getOldExpression(String expr) {
        return "\\old(" + expr + ")";
    }
}