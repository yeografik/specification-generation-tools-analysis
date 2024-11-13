package java_classes.specs.copy_generators;

import java.util.List;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

/**
 * Generates a copy of a reference expression by creating a new variable name
 * and assigning it to the original expression.
 *
 * <p>This generator replaces a reference expression with a new identifier,
 * storing the replacement in the {@link JMLSyntaxTranslator} for later
 * translation into Java-compatible assertions.
 */
public class ReferenceCopyGenerator extends CopyGenerator {

    /**
     * Initializes a new {@code ReferenceCopyGenerator} with the specified
     * subject class and JML syntax translator.
     *
     * @param subjectClass the subject class for which the reference copy is generated
     * @param jmlTranslator the translator managing JML syntax replacements
     */
    public ReferenceCopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
    }

    /**
     * Creates a copy of the provided expression by assigning it to a newly generated variable.
     *
     * <p>This method expects a {@code String} to be given as parameter, first casts the expression
     * to a string, then generates a new variable name and updates the JML syntax translator to
     * replace occurrences of the original expression in JML specific sentences with the new variable.
     *
     * @param expression the reference expression to copy
     * @return a list containing the copied expression as a single string
     */
    public List<String> copy(Object expression) {
        String expr = castParameter(expression);
        String newName = generateNewName(expr);
        jmlTranslator.addReplacement(expr, newName);
        String copy = createCopy(expr, newName);
        
        return copyAsList(copy);
    }

    /**
     * Casts the provided parameter to a {@code String}, throwing an exception if invalid.
     *
     * <p>Ensures that the provided parameter is a non-null {@code String} object.
     *
     * @param param the object to cast
     * @return the parameter as a {@code String}
     * @throws IllegalArgumentException if {@code param} is {@code null} or not a {@code String}
     */
    private String castParameter(Object param) {
        if (param == null)
            throw new IllegalArgumentException("Parameter is null");
        
        return tryToCastParameter(param);
    }

    /**
     * Attempts to cast the parameter to a {@code String}, handling potential {@code ClassCastException}.
     *
     * @param param the object to cast
     * @return the parameter as a {@code String}
     * @throws IllegalArgumentException if the cast fails
     */
    private String tryToCastParameter(Object param) {
        try {
            return (String) param;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("The given parameter is not an instance of String class, " + e.getMessage());
        }
    }

    /**
     * Generates a new name for the expression by using its base component.
     *
     * @param expr the original expression
     * @return a generated variable name for the expression
     */
    private String generateNewName(String expr) {
        String[] exprParts = getExpressionParts(expr);
        return NameGenerator.newVariableNameFor(exprParts[0]);
    }

    /**
     * Creates the code necessary to declare and initialize a new variable for the expression.
     *
     * @param expr the original expression
     * @param newName the new variable name
     * @return a string representing the declaration and assignment code for the expression
     */
    private String createCopy(String expr, String newName) {
        return RawCodeCreator.createDeclaration("Object", newName, expr);
    }
}