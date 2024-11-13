package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.stmt.ExpressionStmt;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

/**
 * Generates a copy of variable assignment expressions by creating a new variable and assigning it
 * the value of the original assignment.
 *
 * <p>This generator also adds replacements to the JML syntax translator to map the original variable
 * name to the new variable, allowing references in specifications to be updated accordingly.</p>
 */
public class VariableAssignmentCopyGenerator extends CopyGenerator {

    /**
     * Constructs a {@code VariableAssignmentCopyGenerator} with the specified subject class and JML syntax translator.
     *
     * @param subjectClass the class containing the variable assignments to be copied
     * @param jmlTranslator the translator used to handle syntax replacements
     */
    public VariableAssignmentCopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
    }

    /**
     * Copies the provided assignment expression by creating a new variable and assigning
     * it the same value as the original assignment.
     *
     * @param expression the assignment expression to copy
     * @return a list containing the generated copy statement
     * @throws IllegalArgumentException if {@code expression} is null or not an {@code ExpressionStmt}
     */
    public List<String> copy(Object expression) {
        ExpressionStmt exprStmt = castParameter(expression);
        String assignmentCopy = copyAssignment(exprStmt);

        return copyAsList(assignmentCopy);
    }

    /**
     * Casts the provided parameter to an {@code ExpressionStmt}, throwing an exception if invalid.
     *
     * <p>Ensures that the provided parameter is a non-null {@code ExpressionStmt} object.
     *
     * @param param the object to cast
     * @return the parameter as an {@code ExpressionStmt}
     * @throws IllegalArgumentException if {@code param} is {@code null} or not a {@code ExpressionStmt}
     */
    private ExpressionStmt castParameter(Object param) {
        if (param == null)
            throw new IllegalArgumentException("Parameter is null");
        
        return tryToCastParameter(param);
    }

    /**
     * Attempts to cast the parameter to a {@code ExpressionStmt}, handling potential {@code ClassCastException}.
     *
     * @param param the object to cast
     * @return the parameter as a {@code ExpressionStmt}
     * @throws IllegalArgumentException if the cast fails
     */
    private ExpressionStmt tryToCastParameter(Object param) {
        try {
            return (ExpressionStmt) param;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("The given parameter is not an instance of ExpressionStmt class, " +
                    e.getMessage());
        }
    }

    /**
     * Creates a copy of the assignment by generating an equivalent assignment with a new variable name.
     *
     * <p>The new assignment is generated using the {@code RawCodeCreator} utility, and the new variable
     * name is registered with the JML syntax translator.</p>
     *
     * @param exprStmt the assignment expression statement to copy
     * @return a string representing the generated assignment copy
     */
    private String copyAssignment(ExpressionStmt exprStmt) {
        Expression expr = exprStmt.getExpression();
        String varName = expr.asAssignExpr().getTarget().toString();
        String newName = NameGenerator.newVariableNameFor(varName);
        String value = expr.asAssignExpr().getValue().toString();
        String assignmentCopy = RawCodeCreator.createAssignment(newName, value);
        jmlTranslator.addReplacement(varName, newName);
        
        return assignmentCopy;
    }
}