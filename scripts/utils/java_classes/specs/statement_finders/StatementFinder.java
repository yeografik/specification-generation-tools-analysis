package java_classes.specs.statement_finders;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithBody;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.Specification;
import java_classes.specs.SubjectClass;

/**
 * Abstract class for finding statement insertion points in a Java class.
 * Implementing classes should define specific logic for identifying the insertion points.
 */
public abstract class StatementFinder {
 
    protected SubjectClass subjectClass;
    protected JMLSyntaxTranslator jmlTranslator;
    protected Specification specification;

    /**
     * Constructs a new {@code StatementFinder} with the given dependencies.
     *
     * @param subjectClass the {@link SubjectClass} being analyzed
     * @param jmlTranslator the {@link JMLSyntaxTranslator} used for handling JML expressions
     * @param spec the {@link Specification} containing specifications for the analysis
     */
    public StatementFinder(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator, Specification spec) {
        this.subjectClass = subjectClass;
        this.jmlTranslator = jmlTranslator;
        this.specification = spec;
    }

    /**
     * Abstract method that finds and returns a list of insertion requests based on the implementation.
     *
     * @return an {@link InsertionRequestsList} with the insertion points found
     */
    public abstract InsertionRequestsList find();

    /**
     * Finds insertion points and creates duplicate statement copies for nested structures within the given body.
     *
     * @param body the list of statements to analyze
     * @return an {@link InsertionRequestsList} with the found positions
     */
    protected InsertionRequestsList createCopies(NodeList<Statement> body) {
        InsertionRequestsList insertionList = findPositionsToCopy(body);
        InsertionRequestsList compositeInsertionList = findPositionsToCopyInCompositeStatements(body);
        insertionList.addAll(compositeInsertionList);
        
        return insertionList;
    }

    /**
     * Abstract method to find positions to create copies in the provided body.
     *
     * @param body the list of statements to analyze
     * @return an {@link InsertionRequestsList} with the found positions
     */
    protected abstract InsertionRequestsList findPositionsToCopy(NodeList<Statement> body);

    /**
     * Checks composite statements within the provided body for positions to copy in the nested structures.
     *
     * @param body the list of statements to check
     * @return an {@link InsertionRequestsList} with the found insertion points
     */
    protected InsertionRequestsList findPositionsToCopyInCompositeStatements(NodeList<Statement> body) {
        InsertionRequestsList insertionList = new InsertionRequestsList();
        for (Statement s : body) {
            InsertionRequestsList compositeInsertionList = checkCompositeStatement(s);
            insertionList.addAll(compositeInsertionList);
        }
        return insertionList;
    }

    /**
     * Recursively checks a single statement for composite structures to identify insertion points.
     *
     * @param s the statement to check
     * @return an {@link InsertionRequestsList} with found positions
     */
    protected InsertionRequestsList checkCompositeStatement(Statement s) {
        if (s instanceof NodeWithStatements<?>)
            return createCopies(((NodeWithStatements<?>)s).getStatements());
        else if (s instanceof NodeWithBody<?>)
            return checkCompositeStatement(((NodeWithBody<?>)s).getBody());
        else if (s.isIfStmt())
            return checkIfStmt(s.asIfStmt());
        else if (s instanceof NodeWithBlockStmt<?>)
            return createCopies(((NodeWithBlockStmt<?>)s).getBody().getStatements());
        else if (s.isTryStmt())
            return createCopies(s.asTryStmt().getTryBlock().getStatements());
        else
            return new InsertionRequestsList();
    }

    /**
     * Checks an {@link IfStmt} for insertion points in its then and else blocks.
     *
     * @param s the {@link IfStmt} to check
     * @return an {@link InsertionRequestsList} with found positions
     */
    protected InsertionRequestsList checkIfStmt(IfStmt s) {
        InsertionRequestsList thenBlockList = checkThenBlock(s);
        InsertionRequestsList elseBlockList = checkElseBlock(s);
        thenBlockList.addAll(elseBlockList);
        return elseBlockList;
    }

    /**
     * Checks the then block of an {@link IfStmt} for nested structures.
     *
     * @param s the {@link IfStmt} to check
     * @return an {@link InsertionRequestsList} with found positions
     */
    protected InsertionRequestsList checkThenBlock(IfStmt s) {
        if (s.hasThenBlock())
            return checkCompositeStatement(s.getThenStmt());
        else
            return new InsertionRequestsList();
    }

    /**
     * Checks the else block of an {@link IfStmt} for nested structures.
     *
     * @param s the {@link IfStmt} to check
     * @return an {@link InsertionRequestsList} with found positions
     */
    protected InsertionRequestsList checkElseBlock(IfStmt s) {
        if (s.hasElseBlock() && s.getElseStmt().isPresent())
            return checkCompositeStatement(s.getElseStmt().get());
        else
            return new InsertionRequestsList();
    }
}