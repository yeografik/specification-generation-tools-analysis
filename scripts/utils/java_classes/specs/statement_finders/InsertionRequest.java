package java_classes.specs.statement_finders;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

public class InsertionRequest {
    
    private NodeList<Statement> body;
    private int originalPosition;
    private String statementString;

    public InsertionRequest(NodeList<Statement> body, int position, String statementString) {
        this.body = body;
        this.originalPosition = position;
        this.statementString = statementString;
    }

    public InsertionRequest(NodeList<Statement> body, int position) {
        this.body = body;
        this.originalPosition = position;
    }

    public NodeList<Statement> getBody() {
        return body;
    }

    public int getPosition() {
        return originalPosition;
    }

    public String getStatementString() {
        return statementString;
    }
}