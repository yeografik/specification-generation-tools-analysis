package java_classes.specs;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.EmptyStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.Type;

import java_classes.specs.statement_finders.InsertionRequest;
import java_classes.specs.statement_finders.InsertionRequestsList;

public class Inserter {

    private SubjectClass subjectClass;

    public Inserter(SubjectClass subjectClass) {
        this.subjectClass = subjectClass;
    }

    public void insertPrecondition(InsertionRequest request) {
        String condition = request.getStatementString();
        if (noCondition(condition))
            return;

        NodeList<Statement> body = request.getBody();
        int position = request.getPosition();
        String preconditionCheck = createPreconditionCheck(condition);
        
        insert(body, position, preconditionCheck);
    }

    public void insertStatements(InsertionRequestsList requests) {
        for (InsertionRequest request : requests) {
            NodeList<Statement> body = request.getBody();
            int position = request.getPosition();
            String copy = request.getStatementString();
            insert(body, position, copy);
        }
    }

    private String createPreconditionCheck(String condition) {
        String preconditionCheck = RawCodeCreator.createIfStatement(condition);
        Type returnType = subjectClass.getMethodType();
        preconditionCheck += RawCodeCreator.createReturnStatement(returnType);

        return preconditionCheck;
    }

    private void insert(NodeList<Statement> body, int pos, String statementString) {
        if (isComment(statementString)) {
            addAsComment(body, pos, statementString);
        } else {
            Statement statement = StaticJavaParser.parseStatement(statementString);
            body.add(pos, statement);
        }
    }

    private void addAsComment(NodeList<Statement> body, int pos, String comment) {
        Statement emptyStmt = new EmptyStmt();
        emptyStmt.setBlockComment(comment);
        body.add(pos, emptyStmt);
    }

    private boolean noCondition(String condition) {
        return condition == null || condition.isEmpty();
    }

    private boolean isComment(String statement) {
        return (statement.contains("\\old(") 
            || statement.contains("\\new(") 
            || statement.contains("\\result") 
            || statement.contains("oneOf.java.jpp: SEQUENCE unimplemented"));
    }
}