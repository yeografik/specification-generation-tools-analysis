package java_classes.specs.statement_finders;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

public class InsertionRequestsList implements Iterable<InsertionRequest> {
    
    private LinkedList<InsertionRequest> requests;

    public InsertionRequestsList() {
        this.requests = new LinkedList<>();
    }

    public void add(NodeList<Statement> body, int position, String statementString) {
        InsertionRequest insertionRequest = new InsertionRequest(body, position, statementString);
        requests.add(insertionRequest);
    }

    public void add(NodeList<Statement> body, int position, List<String> copies) {
        for (String statementString : copies) {
            InsertionRequest request = new InsertionRequest(body, position++, statementString);
            requests.add(request);
        }
    }

    public void addInsertionList(InsertionRequestsList list) {
        for (InsertionRequest request : list.requests)
            requests.add(request);
    }

    @Override
    public Iterator<InsertionRequest> iterator() {
        return requests.iterator();
    }
}