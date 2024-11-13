package java_classes.specs;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.EmptyStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.Type;

import java_classes.specs.statement_finders.InsertionRequest;
import java_classes.specs.statement_finders.InsertionRequestsList;

/**
 * Handles the insertion of statements into method bodies, including preconditions and other
 * statements, while ensuring proper handling of JML-specific syntax.
 */
public class Inserter {

    private SubjectClass subjectClass;

    /**
     * Constructs an Inserter for managing insertions in the specified SubjectClass.
     *
     * @param subjectClass the SubjectClass instance where statements will be inserted
     */
    public Inserter(SubjectClass subjectClass) {
        this.subjectClass = subjectClass;
    }

    /**
     * Inserts a precondition check in as an if-statement at the specified position in the method body.
     *
     * <p>The statement is inserted only if a condition is provided.
     *
     * @param request the request containing the body, position, and statement string for insertion
     */
    public void insertPrecondition(InsertionRequest request) {
        String condition = request.getStatementString();
        if (noCondition(condition))
            return;

        NodeList<Statement> body = request.getBody();
        int position = request.getPosition();
        String preconditionCheck = createPreconditionCheck(condition);
        
        insert(body, position, preconditionCheck);
    }

    /**
     * Inserts a list of statements at their respective positions in the method body.
     *
     * @param requests the list of requests, each containing a body, position, and statement string for insertion
     */
    public void insertStatements(InsertionRequestsList requests) {
        for (InsertionRequest request : requests) {
            NodeList<Statement> body = request.getBody();
            int position = request.getPosition();
            String copy = request.getStatementString();
            insert(body, position, copy);
        }
    }

    /**
     * Creates a precondition check statement as an if-statement followed by a return statement.
     *
     * @param condition the condition to be checked in the if-statement
     * @return a string representation of the generated precondition check statement
     */
    private String createPreconditionCheck(String condition) {
        String preconditionCheck = RawCodeCreator.createIfStatement(condition);
        Type returnType = subjectClass.getMethodType();
        preconditionCheck += RawCodeCreator.createReturnStatement(returnType);

        return preconditionCheck;
    }

    /**
     * Inserts a given statement string into the method body at the specified position.
     * If the statement contains JML-specific syntax, it is added as a comment.
     *
     * @param body the method body as a NodeList of statements
     * @param pos the position at which to insert the statement
     * @param statementString the statement to insert
     */
    private void insert(NodeList<Statement> body, int pos, String statementString) {
        if (containsJMLSyntax(statementString)) {
            addAsComment(body, pos, statementString);
        } else {
            Statement statement = StaticJavaParser.parseStatement(statementString);
            body.add(pos, statement);
        }
    }

    /**
     * Adds a comment to the method body at the specified position.
     *
     * @param body the method body as a NodeList of statements
     * @param pos the position at which to add the comment
     * @param statement the comment text to insert
     */
    private void addAsComment(NodeList<Statement> body, int pos, String statement) {
        Statement emptyStmt = new EmptyStmt();
        emptyStmt.setBlockComment(statement);
        body.add(pos, emptyStmt);
    }

    /**
     * Checks if a condition string is null or empty.
     *
     * @param condition the condition string to check
     * @return true if the condition is null or empty; false otherwise
     */
    private boolean noCondition(String condition) {
        return condition == null || condition.isEmpty();
    }

    /**
     * Checks whether a given statement string contains JML-specific syntax that requires it
     * to be commented out when inserted.
     *
     * @param statement the statement string to check
     * @return true if the statement contains JML-specific syntax; false otherwise
     */
    private boolean containsJMLSyntax(String statement) {
        return (statement.contains("\\old(") 
            || statement.contains("\\new(") 
            || statement.contains("\\result") 
            || statement.contains("oneOf.java.jpp: SEQUENCE unimplemented"));
    }
}