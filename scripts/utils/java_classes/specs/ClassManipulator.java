package java_classes.specs;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.statement_finders.InsertionRequest;
import java_classes.specs.statement_finders.InsertionRequestsList;
import java_classes.specs.statement_finders.StatementFinder;
import java_classes.specs.statement_finders.StatementFinderType;
import java_classes.specs.statement_finders.factory.StatementFinderFactory;

import static java_classes.specs.statement_finders.StatementFinderType.OLD_VARIABLE_STATEMENT_FINDER;
import static java_classes.specs.statement_finders.StatementFinderType.RETURN_STATEMENT_FINDER;

/**
 * Handles manipulation of a {@code SubjectClass} by inserting required variable duplications,
 * preconditions, and postconditions.
 * The class utilizes other components like {@code Inserter}, {@code StatementFinderFactory},
 * and {@code JMLSyntaxTranslator} to coordinate insertion and duplication of variables
 * and conditions at specific points within a method.
 */
public class ClassManipulator {
    
    private SubjectClass subjectClass;
    private VariablesToDuplicate variablesToDuplicate;
    private Specification specification;
    private Inserter inserter;
    private JMLSyntaxTranslator jmlTranslator;
    private StatementFinderFactory statementFinderFactory;

    /**
     * Constructs a {@code ClassManipulator} to handle manipulation operations for a
     * {@code SubjectClass}. Initializes components needed to duplicate variables, find
     * statements, and insert preconditions and postconditions.
     *
     * @param subjectClass The target class for manipulation.
     * @param varsToDuplicate Variables that need to be duplicated.
     * @param spec Specification containing preconditions and postconditions for the class.
     */
    public ClassManipulator(SubjectClass subjectClass, VariablesToDuplicate varsToDuplicate, Specification spec) {
        this.subjectClass = subjectClass;
        this.variablesToDuplicate = varsToDuplicate;
        this.jmlTranslator = new JMLSyntaxTranslator(varsToDuplicate);
        this.inserter = new Inserter(subjectClass);
        this.specification = spec;
        this.statementFinderFactory = new StatementFinderFactory(subjectClass, jmlTranslator, spec);
    }
    
    /**
     * Copies the initial values of old variables at the beginning of the method and duplicates
     * these values where necessary. Specifically, this method duplicates any initialized
     * variables and then searches for statements that require duplication to retain the "old"
     * state of variables at specific points.
     */
    public void duplicateOldVariables() {
        duplicateInitialVariables();
        InsertionRequestsList insertionList = generateInsertionRequests(OLD_VARIABLE_STATEMENT_FINDER);
        inserter.insertStatements(insertionList);
    }

    /**
     * Inserts the method's precondition as defined in the {@code Specification} at the start
     * of the method's body.
     */
    public void insertPreCondition() {
        NodeList<Statement> body = subjectClass.getMethodBody();
        String preCondition = specification.getPreCondition();
        InsertionRequest InsertionRequest = new InsertionRequest(body, 0, preCondition);
        inserter.insertPrecondition(InsertionRequest);
    }

    /**
     * Inserts postconditions at designated return points within the method body, based on
     * the provided specification. This method locates and inserts postconditions just before
     * return statements, ensuring verification after method execution.
     */
    public void insertPostConditions() {
        InsertionRequestsList insertionList = generateInsertionRequests(RETURN_STATEMENT_FINDER);
        inserter.insertStatements(insertionList);
    }

    /**
     * Utilizes {@code InitialStateDuplicator} to copy values of initialized variables at the
     * beginning of the method body. This method duplicates parameters, references, and
     * Daikon-related arguments, setting up the method for verification.
     */
    private void duplicateInitialVariables() {
        InitialStateDuplicator duplicator = new InitialStateDuplicator(subjectClass, variablesToDuplicate, jmlTranslator);
        duplicator.duplicateParameters();
        duplicator.duplicateReferences();
        duplicator.duplicateDaikonArguments();
    }

    /**
     * Finds statements of a specified type (e.g., old variable assignments or return statements)
     * within the method body using a {@code StatementFinder} created by the
     * {@code StatementFinderFactory}.
     *
     * @param type The type of statement finder to use for locating specific statements.
     * @return An {@code InsertionRequestsList} containing requests to insert statements
     *         at located positions.
     */
    private InsertionRequestsList generateInsertionRequests(StatementFinderType type) {
        StatementFinder oldVariableStmtFinder = statementFinderFactory.create(type);
        return oldVariableStmtFinder.find();
    }
}