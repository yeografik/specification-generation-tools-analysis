package java_classes.specs;

import java.util.HashSet;
import java.util.Set;

/*
 * TODO: maybe should mention daikon in the name?
 */
public class VariablesToDuplicate {
    
    private Set<String> variables;
    private Set<String> references;
    private Set<String> complexReferences;

    public VariablesToDuplicate(Specification spec) {
        variables = new HashSet<>();
        references = new HashSet<>();
        complexReferences = new HashSet<>();
        searchVariablesToDuplicate(spec.clone());
    }

    public boolean containsVariable(String variable) {
        return variables.contains(variable);
    }

    public void removeVariable(String variable) {
        variables.remove(variable);
    }
    
    public Set<String> getVariables() {
        return variables;
    }

    public void removeReference(String reference) {
        references.remove(reference);
    }
    
    public Set<String> getReferences() {
        return references;
    }
    
    public Set<String> getComplexReferences() {
        return complexReferences;
    }

    public void removeComplexReference(String complexReference) {
        complexReferences.remove(complexReference);
    }

    public void remove(String varName) {
        if (variables.contains(varName))
            removeVariable(varName);
        else if (references.contains(varName))
            removeReference(varName);
        else
            removeComplexReference(varName);
    }

    private void searchVariablesToDuplicate(Specification specification) {
        String specs = specification.getSpecificationAsString();
        
        findOldVariables(specs);
        findOldReferences(specs);
        findOldDaikonCalls(specs);
        removeThisFromVariables();
    }

    private void findOldVariables(String specs) {
        variables = DaikonPatternMatcher.matchOldVariables(specs);
    }
    
    private void findOldReferences(String specs) {
        references = DaikonPatternMatcher.matchOldReferences(specs);
    }
    
    private void findOldDaikonCalls(String specs) {
        complexReferences = DaikonPatternMatcher.matchOldComplexReferences(specs);
    }

    private void removeThisFromVariables() {
        if (variables.contains("this")) {
            variables.remove("this");
            references.add("this");
        }
    }
}