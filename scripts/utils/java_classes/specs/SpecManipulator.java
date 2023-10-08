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
    private static Set<String> oldReferences;
    private static Set<String> cloneRequiredOldRefs;

    public SpecManipulator(String[] specs) {
        preCondition = specs[0];
        postConditions = Arrays.copyOfRange(specs, 1, specs.length);
        oldVariables = new HashSet<>();
        oldReferences = new HashSet<>();
        cloneRequiredOldRefs = new HashSet<>();
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

    public Set<String> getOldReferences() {
        return oldReferences;
    }

    public Set<String> getCloneRequiredOldRefs() {
        return cloneRequiredOldRefs;
    }

    public static String toJavaFormat(ReturnStmt returnStmt, int index, Map<String, String> oldVarsReplacement) {
        String returnBody = returnStmt.getExpression().get().toString();
        String postCond = postConditions[index];
        postCond = postCond.replace("\\result", returnBody);
        for (Map.Entry<String, String> set : oldVarsReplacement.entrySet())
            postCond = postCond.replace(set.getKey(), set.getValue());
        
        postConditions[index] = postCond;
        return postCond;
    }

    public static String toJavaFormat(int index, Map<String, String> oldVarsReplacement) {
        String postCond = postConditions[index];
        for (Map.Entry<String, String> set : oldVarsReplacement.entrySet())
            postCond = postCond.replace(set.getKey(), set.getValue());
        
        postConditions[index] = postCond;
        return postCond;
    }

    private void calculateOldVariables() {
        String specs=preCondition;
        for (String cond : postConditions)
            specs+= cond;
        
        addOldVariables(specs);
        addOldReferences(specs);
        addOldDaikonCalls(specs);
        if (oldVariables.contains("this")) {
            oldVariables.remove("this");
            oldReferences.add("this");
        }
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
    
    private void addOldReferences(String specs) {
        Matcher m = Pattern.compile("\\\\old\\([a-z_$][a-zA-Z_$0-9]*(\\.[a-zA-Z_$0-9]+(\\(.[^\\)]*\\))?)+\\)").matcher(specs);
        while(m.find()) {
            String found = m.group();
            if (found.contains("daikon")) 
                continue;
            found = found.replace("\\old(", "").replaceAll("\\)$", ""); //extract expression
            oldReferences.add(found);
        }
    }
    
    private void addOldDaikonCalls(String specs) {
        Matcher m = Pattern.compile("\\\\old\\(daikon\\.Quant\\.size\\([a-zA-Z_$0-9]+(\\.[a-zA-Z_$0-9]+)*\\)\\)").matcher(specs);
        while(m.find()) {
            String found = m.group();
            found = found.replace("\\old(daikon.Quant.size(", "").replace("))", ""); //extract variable name
            cloneRequiredOldRefs.add(found);
        }
    }
}
