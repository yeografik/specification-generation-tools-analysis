package java_classes.specs.statement_finders;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

/**
 * Represents a collection of {@link InsertionRequest} objects.
 * This class provides methods to manage and iterate over a list of insertion requests,
 * each representing an insertion operation into a method body.
 */
public class InsertionRequestsList implements Iterable<InsertionRequest> {
    
    private LinkedList<InsertionRequest> requests;

    /**
     * Initializes an empty list of insertion requests.
     */
    public InsertionRequestsList() {
        this.requests = new LinkedList<>();
    }

    /**
     * Adds a new insertion request with a single statement string to the list.
     *
     * @param body the NodeList of statements representing the method body
     * @param position the position at which the statement should be inserted
     * @param statementString the statement to be inserted as a string
     */
    public void add(NodeList<Statement> body, int position, String statementString) {
        InsertionRequest insertionRequest = new InsertionRequest(body, position, statementString);
        requests.add(insertionRequest);
    }

    /**
     * Adds multiple insertion requests to the list, each with a statement string
     * from the provided list. The position is incremented for each request added.
     *
     * @param body the NodeList of statements representing the method body
     * @param startPosition the initial position for the first statement insertion
     * @param copies a list of statement strings to be inserted
     */
    public void add(NodeList<Statement> body, int startPosition, List<String> copies) {
        int position = startPosition;
        for (String statementString : copies) {
            InsertionRequest request = new InsertionRequest(body, position++, statementString);
            requests.add(request);
        }
    }

    /**
     * Adds all the insertion requests from another {@link InsertionRequestsList} to this list.
     *
     * @param list the {@link InsertionRequestsList} containing insertion requests to add
     */
    public void addAll(InsertionRequestsList list) {
        requests.addAll(list.requests);
    }

    /**
     * Returns an iterator over the {@link InsertionRequest} objects in this list.
     *
     * @return an iterator for traversing the insertion requests
     */
    @Override
    public Iterator<InsertionRequest> iterator() {
        return requests.iterator();
    }
}