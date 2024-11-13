package java_classes.specs.statement_finders;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

/**
 * Represents a request for inserting a statement into a method body.
 * It encapsulates the body where the statement should be inserted, the position,
 * and the statement string itself.
 */
public class InsertionRequest {
    
    private final NodeList<Statement> body;
    private final int position;
    private final String statementString;

    /**
     * Constructs an InsertionRequest with a specified body, position, and statement string.
     *
     * @param body the NodeList of statements representing the method body
     * @param position the position at which the statement should be inserted
     * @param statementString the statement to be inserted as a string, if null, empty string is inserted
     */
    public InsertionRequest(NodeList<Statement> body, int position, String statementString) {
        this.body = body;
        this.position = position;
        this.statementString = statementString == null ? "" : statementString;
    }

    /**
     * Retrieves the method body where the insertion will be performed.
     *
     * @return the NodeList of statements representing the method body
     */
    public NodeList<Statement> getBody() {
        return body;
    }

    /**
     * Retrieves the position for the insertion in the body.
     *
     * @return the position in the body where the statement should be inserted
     */
    public int getPosition() {
        return position;
    }

    /**
     * Retrieves the statement string to be inserted.
     *
     * @return the statement string, or null if none was provided
     */
    public String getStatementString() {
        return statementString;
    }
}