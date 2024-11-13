package java_classes.specs.copy_generators;

import java.util.LinkedList;
import java.util.List;

import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.checker.JMLStatementChecker;
import java_classes.specs.SubjectClass;

/**
 * Generates copies for variable declaration statements, creating a new variable name
 * and assigning it the same initializer as the original variable.
 *
 * <p>Uses the JML translator to manage syntax replacements, ensuring that old variable
 * references are properly mapped to their new names in JML specifications.</p>
 */
public class VariableDeclarationCopyGenerator extends CopyGenerator {

    /**
     * Constructs a {@code VariableDeclarationCopyGenerator} with the specified subject class and JML syntax translator.
     *
     * @param subjectClass the class containing the variable declarations to be copied
     * @param jmlTranslator the translator used to handle syntax replacements
     */
    public VariableDeclarationCopyGenerator(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
    }

    /**
     * Copies the provided variable declaration expression, creating new variables with unique names
     * for any variables in the declaration that needs to be copied.
     *
     * @param expression the variable declaration expression to copy
     * @return a list of strings representing the generated copy statements
     * @throws IllegalArgumentException if {@code expression} is null or not an {@code ExpressionStmt}
     */
    public List<String> copy(Object expression) {
        List<String> copies = new LinkedList<>();
        VariableDeclarationExpr varDeclarationExpression = getVariableDeclarationExpression(expression);
        for (VariableDeclarator var : varDeclarationExpression.getVariables())
            if (needsCopy(var))
                addCopy(var, copies);
        
        return copies;
    }

    /**
     * Extracts the {@code VariableDeclarationExpr} from the given expression statement.
     *
     * @param expression the expression containing the variable declarations
     * @return the {@code VariableDeclarationExpr} contained in the expression statement
     * @throws IllegalArgumentException if {@code expression} is not an instance of {@code ExpressionStmt}
     */
    private VariableDeclarationExpr getVariableDeclarationExpression(Object expression) {
        ExpressionStmt exprStmt = castParameter(expression);
        Expression expr = exprStmt.getExpression();
        return expr.asVariableDeclarationExpr();
    }

    /**
     * Casts the provided parameter to an {@code VariableDeclarationExpr}, throwing an exception if invalid.
     *
     * <p>Ensures that the provided parameter is a non-null {@code VariableDeclarationExpr} object.
     *
     * @param param the object to cast
     * @return the parameter as an {@code VariableDeclarationExpr}
     * @throws IllegalArgumentException if {@code param} is {@code null} or not a {@code VariableDeclarationExpr}
     */
    private ExpressionStmt castParameter(Object param) {
        if (param == null)
            throw new IllegalArgumentException("Parameter is null");
        
        return tryToCastParameter(param);
    }

    /**
     * Attempts to cast the parameter to a {@code VariableDeclarationExpr}, handling potential {@code ClassCastException}.
     *
     * @param param the object to cast
     * @return the parameter as a {@code VariableDeclarationExpr}
     * @throws IllegalArgumentException if the cast fails
     */
    private ExpressionStmt tryToCastParameter(Object param) {
        try {
            return (ExpressionStmt) param;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("The given parameter is not an instance of ExpressionStmt class, " + e.getMessage());
        }
    }

    /**
     * Determines if the specified variable needs to be copied based on initialization and {@code \old} JML expression.
     *
     * @param var the variable to evaluate
     * @return {@code true} if the variable should be copied; {@code false} otherwise
     */
    private boolean needsCopy(VariableDeclarator var) {
        return JMLStatementChecker.isOldVarInitialization(var);
    }

    /**
     * Adds a copy of the specified variable to the list of copies.
     *
     * <p>Generates a new variable name and an assignment using the variable’s initializer,
     * then adds the new name to the JML syntax translator for future replacements.</p>
     *
     * @param var the variable to copy
     * @param copies the list of copies to which the new variable copy will be added
     */
    private void addCopy(VariableDeclarator var, List<String> copies) {
        String varName = var.getNameAsString();
        String newName = NameGenerator.newVariableNameFor(varName);
        String varInitializer = var.getInitializer().get().toString();
        String assignmentCopy = RawCodeCreator.createAssignment(newName, varInitializer);
        jmlTranslator.addReplacement(varName, newName);
        copies.add(assignmentCopy);
    }
}