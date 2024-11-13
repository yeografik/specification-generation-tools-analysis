package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.type.Type;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

/**
 * Generates a copy of an attribute by creating a new variable assigned to the
 * current value of the attribute.
 *
 * <p>This generator creates a new variable with a unique name, and constructs
 * the Java code for declaring and assigning the new variable. If the type
 * cannot be determined, it generates a comment instead.
 */
public class AttributeCopyGenerator extends CopyGenerator {

    /**
     * Initializes a new {@code AttributeCopyGenerator} with the specified
     * subject class and JML syntax translator.
     *
     * @param subjectClass the class containing the attribute to be copied
     * @param jmlTranslator the translator for handling syntax replacements
     */
    public AttributeCopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
    }

    /**
     * Creates a copy of the specified attribute by declaring a new variable
     * and assigning it the attribute's current value.
     *
     * @param expression the attribute expression to copy
     * @return a list containing the generated copy statement
     * @throws IllegalArgumentException if {@code expression} is null or not a {@code String}
     */
    public List<String> copy(Object expression) {
        String expr = castParameter(expression);
        String[] exprParts = getExpressionParts(expr);
        String newName = NameGenerator.newVariableNameFor(exprParts);
        
        Type type = getExpressionType(exprParts);
        String copy = copyAttribute(type, expr, newName);
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
     * Creates the attribute copy by declaring a new variable and initializing it with the
     * attribute expression.
     *
     * @param type the data type of the attribute
     * @param expr the expression to copy
     * @param newName the name of the new variable
     * @return a Java code string representing the attribute copy
     */
    private String copyAttribute(Type type, String expr, String newName) {
        if (type == null)
            return attributeAsComment(expr, newName);

        String copy;
        if (type.isPrimitiveType())
            copy = RawCodeCreator.createDeclaration(type.asString(), newName, expr);
        else
            copy = RawCodeCreator.createDeclaration("Object", newName, expr);

        jmlTranslator.addReplacement(expr, newName);
        return copy;
    }

    /**
     * Creates a comment to represent an attribute copy when the attribute type cannot be determined.
     *
     * @param expr the expression to copy
     * @param newName the name of the new variable
     * @return a comment string describing the copy of the undefined attribute
     */
    private String attributeAsComment(String expr, String newName) {
        System.out.println("attribute of expression " + expr + " is not part of the class, skipping");
        return "\\old(" + expr + "), something " + newName + " = " + expr + ";";
    }
}