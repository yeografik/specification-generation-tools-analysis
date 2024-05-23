package java_classes.specs;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DaikonPatternMatcher {

    private static String oldVariablePattern = "\\\\old\\([a-z_$][a-zA-Z_$0-9]*\\)";
    private static String oldReferencePattern = "\\\\old\\([a-z_$][a-zA-Z_$0-9]*(\\.[a-zA-Z_$0-9]+(\\([^\\)]*\\))?)+\\)";
    private static String daikonCallPattern = "\\\\old\\(daikon\\.Quant\\.size\\([a-zA-Z_$0-9]+(\\.[a-zA-Z_$0-9]+)*\\)\\)";

    public static Set<String> matchOldVariables(String specs) {
        Set<String> oldVariables = new HashSet<>();
        Matcher m = Pattern.compile(oldVariablePattern).matcher(specs);
        while(m.find()) {
            String matchingExpression = m.group();
            String variableName = extractVariableName(matchingExpression);
            oldVariables.add(variableName);
        }

        return oldVariables;
    }

    public static Set<String> matchOldReferences(String specs) {
        Set<String> oldReferences = new HashSet<>();
        Matcher m = Pattern.compile(oldReferencePattern).matcher(specs);
        while(m.find()) {
            String matchingExpression = m.group();
            if (matchingExpression.contains("daikon")) 
                continue;
            String reference = extractReferenceExpression(matchingExpression);
            oldReferences.add(reference);
        }

        return oldReferences;
    }

    public static Set<String> matchOldComplexReferences(String specs) {
        Set<String> oldComplexReferences = new HashSet<>();
        Matcher m = Pattern.compile(daikonCallPattern).matcher(specs);
        while(m.find()) {
            String matchingExpression = m.group();
            String complexReference = extractFunctionArgument(matchingExpression);
            oldComplexReferences.add(complexReference);
        }

        return oldComplexReferences;
    }

    public static boolean hasAttributePattern(String expression) {
        Matcher m = Pattern.compile("[a-zA-Z_$0-9]+$").matcher(expression);
        return m.find();
    }

    private static String extractVariableName(String expression) {
        return expression.replace("\\old(", "").replace(")", "");
    }

    private static String extractReferenceExpression(String expression) {
        return expression.replace("\\old(", "").replaceAll("\\)$", "");
    }

    private static String extractFunctionArgument(String expression) {
        return expression.replace("\\old(daikon.Quant.size(", "").replace("))", "");
    }
}