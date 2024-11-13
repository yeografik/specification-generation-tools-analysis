package java_classes.specs.copy_generators;

import java.util.LinkedList;
import java.util.List;

import com.github.javaparser.ast.type.Type;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.SubjectClass;

/**
 * Abstract base class for generating copies of statements, enabling translation of JML expressions
 * into Java-compatible assertions or related specifications.
 *
 * <p>Implementations of this class define how different types of statements are copied,
 * utilizing the {@link JMLSyntaxTranslator} to manage JML expressions and interacting
 * with the provided {@link SubjectClass} to obtain necessary type information.
 */
public abstract class CopyGenerator {

    protected SubjectClass subjectClass;
    protected JMLSyntaxTranslator jmlTranslator;

    /**
     * Constructs a {@code CopyGenerator} with the specified subject class and syntax translator.
     *
     * @param subjectClass the subject class for which copies will be generated
     * @param jmlTranslator the translator for handling JML syntax within expressions
     */
    public CopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        this.subjectClass = subjectClass;
        this.jmlTranslator = jmlTranslator;
    }

    /**
     * Generates a copy of the specified statement as a new statement in the form of a {@code List<String>}.
     *
     * <p>This method must be implemented by subclasses, specifying the exact
     * translation or conversion logic for each statement type.
     *
     * @param statement the statement to be copied
     * @return a list of strings representing the copied statement(s)
     */
    public abstract List<String> copy(Object statement);

    /**
     * Retrieves the type of a given expression, based on its dot-separated components.
     *
     * <p>This method is used to evaluate the type of a component within an expression,
     * leveraging the subject class to access attribute type information.
     *
     * @param exprParts an array of expression components separated by dots
     * @return the type of the final component in the expression, or {@code null} if not found
     */
    protected Type getExpressionType(String[] exprParts) {
        String lastPart = exprParts[exprParts.length -1];
        return subjectClass.getAttributeType(lastPart);
    }

    /**
     * Splits a dot-separated expression into its individual components.
     *
     * <p>This method is helpful for processing multi-part expressions where each component
     * might represent a distinct field, method, or variable.
     *
     * @param expr the expression to split
     * @return an array of individual components in the expression
     */
    protected String[] getExpressionParts(String expr) {
        return expr.split("\\.");
    }

    /**
     * Wraps a single string copy into a list for consistency in returning multiple statements.
     *
     * @param copy the single copy to wrap as a list
     * @return a list containing the single copied statement
     */
    protected List<String> copyAsList(String copy) {
        List<String> copies = new LinkedList<>();
        copies.add(copy);
        return copies;
    }
}