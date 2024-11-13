package java_classes.specs;

import java_classes.specs.patern_matcher.JMLPatternMatcher;

import java.util.HashSet;
import java.util.Set;

/**
 * The {@code VariablesToDuplicate} class manages sets of variable names, references, 
 * and Daikon arguments that need to be duplicated within a given specification.
 * <p>This class initializes the sets based on patterns found in a specification's content
 * and provides methods to access and manipulate them.
 */
public class VariablesToDuplicate {

    private Set<String> variables;
    private Set<String> references;
    private Set<String> daikonArguments;

    /**
     * Constructs a {@code VariablesToDuplicate} instance and initializes the variable sets
     * by analyzing the provided specification for patterns requiring duplication.
     *
     * @param spec the specification to analyze and find variables, references, 
     *             and Daikon arguments for duplication
     */
    public VariablesToDuplicate(Specification spec) {
        variables = new HashSet<>();
        references = new HashSet<>();
        daikonArguments = new HashSet<>();
        searchVariablesToDuplicate(spec.copy());
    }

    /**
     * Checks if a variable is present in the set of variables to be duplicated.
     *
     * @param variable the name of the variable to check
     * @return {@code true} if the variable is in the set, {@code false} otherwise
     */
    public boolean containsVariable(String variable) {
        return variables.contains(variable);
    }

    /**
     * Removes a specified variable from the set of variables to be duplicated.
     *
     * @param variable the name of the variable to remove
     */
    public void removeVariable(String variable) {
        variables.remove(variable);
    }

    /**
     * Returns the set of variables to be duplicated.
     *
     * @return a set of variable names
     */
    public Set<String> getVariables() {
        return variables;
    }

    /**
     * Removes a specified reference from the set of references to be duplicated.
     *
     * @param reference the name of the reference to remove
     */
    public void removeReference(String reference) {
        references.remove(reference);
    }

    /**
     * Returns the set of references to be duplicated.
     *
     * @return a set of reference names
     */
    public Set<String> getReferences() {
        return references;
    }

    /**
     * Removes a specified Daikon argument from the set of Daikon arguments to be duplicated.
     *
     * @param daikonArgument the name of the Daikon argument to remove
     */
    public void removeDaikonArgument(String daikonArgument) {
        daikonArguments.remove(daikonArgument);
    }

    /**
     * Returns the set of Daikon arguments to be duplicated.
     *
     * @return a set of Daikon argument names
     */
    public Set<String> getDaikonArguments() {
        return daikonArguments;
    }

    /**
     * Removes a specified variable, reference, or Daikon argument from its respective set
     * based on where it is found.
     *
     * @param varName the name of the variable, reference, or Daikon argument to remove
     */
    public void remove(String varName) {
        if (variables.contains(varName))
            removeVariable(varName);
        else if (references.contains(varName))
            removeReference(varName);
        else
            removeDaikonArgument(varName);
    }

    /**
     * Analyzes the given specification to find and categorize variables, references,
     * and Daikon arguments for duplication.
     *
     * @param specification the specification to search
     */
    private void searchVariablesToDuplicate(Specification specification) {
        String specs = specification.getSpecificationAsString();
        
        findJMLOldVariables(specs);
        findJMLOldReferences(specs);
        findJMLOldDaikonArguments(specs);
        removeThisFromVariables();
    }

    /**
     * Finds and stores old JML variables within the specification string.
     *
     * @param specs the specification string to analyze
     */
    private void findJMLOldVariables(String specs) {
        variables = JMLPatternMatcher.matchOldVariables(specs);
    }

    /**
     * Finds and stores old JML references within the specification string.
     *
     * @param specs the specification string to analyze
     */
    private void findJMLOldReferences(String specs) {
        references = JMLPatternMatcher.matchOldReferences(specs);
    }

    /**
     * Finds and stores old JML Daikon arguments within the specification string.
     *
     * @param specs the specification string to analyze
     */
    private void findJMLOldDaikonArguments(String specs) {
        daikonArguments = JMLPatternMatcher.matchOldDaikonFunction(specs);
    }

    /**
     * Removes the "this" variable from the set of variables and adds it to references, 
     * as it is considered a special case.
     */
    private void removeThisFromVariables() {
        if (variables.contains("this")) {
            variables.remove("this");
            references.add("this");
        }
    }
}