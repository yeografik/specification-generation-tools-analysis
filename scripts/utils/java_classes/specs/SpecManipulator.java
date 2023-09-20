package java_classes.specs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.javaparser.ast.stmt.ReturnStmt;

public class SpecManipulator {

    private static String preCondition;
    private static String[] postConditions;
    private static Set<String> oldVariables;

    public SpecManipulator(String[] specs) {
        preCondition = specs[0];
        postConditions = Arrays.copyOfRange(specs, 1, specs.length);
        oldVariables = new HashSet<>();
        calculateOldVariables();
    }

    public String getPreCondition() {
        return preCondition;
    }

    public String[] getPostConditions() {
        return postConditions;
    }

    public Set<String> getOldVariables() {
        return oldVariables;
    }

    public static String toJavaFormat(ReturnStmt returnStmt, int index, Map<String, String> oldVarsReplacement) {
        String returnBody = returnStmt.getExpression().get().toString();
        String condition = postConditions[index];
        condition = condition.replace("\\result", returnBody);
        
        for (Map.Entry<String, String> set : oldVarsReplacement.entrySet())
            condition = condition.replace(set.getKey(), set.getValue());
        
        postConditions[index] = condition;
        return condition;
    }

    private void calculateOldVariables() {
        String specs=preCondition;
        for (String cond : postConditions)
            specs+= cond;
        
        // System.out.println("specs before fst: " + specs + "\n\n");
        addOldVariables(specs);
        // System.out.println("specs after fst: " + specs + "\n\n");
        addOldVariableMethodCalls(specs);
    }

    private void addOldVariables(String specs) {
        Matcher m = Pattern.compile("\\\\old\\([a-z_$][a-zA-Z_$0-9]*\\)").matcher(specs);
        while(m.find()) {
            String found = m.group();
            System.out.println("found: " + found);
            found = found.replace("\\old(", "").replace(")", ""); //extract variable name
            oldVariables.add(found);
        }
    }
    
    private void addOldVariableMethodCalls(String specs) {
        Matcher m = Pattern.compile("\\\\old\\([a-z_$][a-zA-Z_$0-9]*(\\.[a-zA-Z_$0-9]+\\(.[^\\)]*\\))+\\)").matcher(specs);
        int i = 0;
        while(m.find()) {
            System.out.println("original: " + specs);
            System.out.println("m.start: " + m.start());
            System.out.println("m.end: " + m.end());
            for (i = 0; i < m.groupCount(); i++) {
                String found = m.group(i);
                System.out.println("found: " + found);
                // System.out.println("found " + found + "\n\n");
                found = found.replace("\\old(", "").replaceAll("(\\.[a-zA-Z_$0-9]+\\(.*\\))+\\)", ""); //extract variable name
            
                // System.out.println("trying to add " + found + "\n\n");
                oldVariables.add(found);
            }
        }
        System.out.println("\n\ni in loop: " + i);
    }

}