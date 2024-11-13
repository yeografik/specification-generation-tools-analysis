package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.type.Type;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

/**
 * {@code DaikonArgumentCopyGenerator} handles  copying reference expressions passed as arguments
 * to Daikon functions within a JML {@code \old} context. The purpose of these copies is to enable
 * comparison with the reference’s original state.
 *
 * <p>Note: This class does not perform actual cloning of objects but adds a placeholder method
 * {@code .attributeCopy()} that users are expected to change as needed.
 */
public class DaikonArgumentCopyGenerator extends CopyGenerator {

    /**
     * Constructs a {@code DaikonArgumentCopyGenerator} with the specified subject class and JML translator.
     *
     * @param subjectClass   the subject class containing metadata about attributes and their types.
     * @param jmlTranslator  the JML translator for managing expression replacements.
     */
    public DaikonArgumentCopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
    }

    /**
     * Generates a copy of the specified expression argument used within Daikon functions.
     * This method is particularly focused on arguments for Daikon-related expressions in
     * {@code \old} contexts, allowing the preservation of an old reference value for later
     * comparison.
     *
     * @param expression  the reference expression to be copied.
     * @return a list containing the copy as a single {@code String}.
     */
    public List<String> copy(Object expression) {
        String expr = castParameter(expression);
        String[] exprParts = getExpressionParts(expr);
        String newName = NameGenerator.newVariableNameFor(exprParts);
        Type type = getExpressionType(exprParts);

        String copy = generateDaikonArgumentCopy(type, expr, newName);
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
            throw new IllegalArgumentException("the given parameter is not an instance of String class, " + e.getMessage());
        }
    }

    /**
     * Generates a copy statement for a reference argument used in Daikon-related functions.
     * Inserts a placeholder call to {@code .attributeCopy()} that the user should replace
     * with an actual clone of the reference argument.
     *
     * @param type     the type of the reference within the expression, if available.
     * @param expr     the original expression referencing the Daikon argument.
     * @param newName  the new variable name for the copied reference.
     * @return a declaration of the copied reference or a comment if the type is null.
     */
    private String generateDaikonArgumentCopy(Type type, String expr, String newName) {
        if (type == null) {
            return copyArgumentAsComment(expr, newName);
        }

        String cloneExpr = expr + ".attributeCopy()";
        String cloneStatement = RawCodeCreator.createDeclaration(type.asString(), newName, cloneExpr);
        jmlTranslator.addJMLFunctionReplacement(expr, newName, "daikon.Quant.size");
        return cloneStatement;
    }

    /**
     * Generates a comment representation for argument references that cannot be copied directly.
     *
     * @param expr     the original expression that couldn't be copied.
     * @param newName  the new variable name that couldn't be copied to.
     * @return the comment representation of the expression.
     */
    private String copyArgumentAsComment(String expr, String newName) {
        System.out.println("expression " + expr + " is not an attribute of the class or is a method call, skipping");
        return "\\old(daikon.Quant.size(" + expr + ")), daikon.Quant.size(" + newName + ")";
    }
}