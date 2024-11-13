package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.body.Parameter;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

/**
 * Generates a copy of a parameter by creating a new variable and assigning it
 * to the original parameter's value.
 *
 * <p>This generator creates a unique variable name for the parameter, updates
 * the {@link JMLSyntaxTranslator} with the replacement, and generates the Java
 * code for declaring and assigning the new variable.
 */
public class ParameterCopyGenerator extends CopyGenerator {

    /**
     * Initializes a new {@code ParameterCopyGenerator} with the specified
     * subject class and JML syntax translator.
     *
     * @param subjectClass the class that holds the parameter to be copied
     * @param jmlTranslator the translator for handling syntax replacements
     */
    public ParameterCopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
    }

    /**
     * Creates a copy of the specified parameter by declaring a new variable
     * assigned to the parameter's current value.
     *
     * @param param the parameter to copy
     * @return a list containing the copied parameter as a single string
     * @throws IllegalArgumentException if {@code param} is null or not a {@code Parameter} instance
     */
    public List<String> copy(Object param) {
        Parameter parameter = castParameter(param);
        String copy = createParameterCopy(parameter);
        
        return copyAsList(copy);
    }

    /**
     * Casts the provided parameter to a {@code Parameter} instance, throwing an exception if invalid.
     *
     * <p>Ensures that the provided parameter is a non-null {@code Parameter} object.
     *
     * @param param the object to cast
     * @return the parameter as a {@code Parameter} instance
     * @throws IllegalArgumentException if {@code param} is {@code null} or not a {@code Parameter}
     */
    private Parameter castParameter(Object param) {
        if (param == null)
            throw new IllegalArgumentException("Parameter is null");
        
        return tryToCastParameter(param);
    }

    /**
     * Attempts to cast the parameter to a {@code Parameter}, handling potential {@code ClassCastException}.
     *
     * @param param the object to cast
     * @return the parameter as a string
     * @throws IllegalArgumentException if the parameter is not a string
     */
    private Parameter tryToCastParameter(Object param) {
        try {
            return (Parameter) param;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("The given parameter is not an instance of Parameter class, " + e.getMessage());
        }
    }

    /**
     * Creates the code necessary to declare and initialize a new variable for the parameter.
     *
     * <p>This method generates a new name for the parameter, updates the JML translator
     * with this replacement, and creates a Java code snippet that declares the new variable
     * and assigns it the original parameter's value.
     *
     * @param parameter the parameter to copy
     * @return a string representing the declaration and assignment code for the parameter
     */
    private String createParameterCopy(Parameter parameter) {
        String paramName = parameter.getNameAsString();
        String newName = NameGenerator.newVariableNameFor(paramName);
        String type = parameter.getTypeAsString();
        String assignmentCopy = RawCodeCreator.createDeclaration(type, newName, paramName);
        jmlTranslator.addReplacement(paramName, newName);
        
        return assignmentCopy;
    }
}