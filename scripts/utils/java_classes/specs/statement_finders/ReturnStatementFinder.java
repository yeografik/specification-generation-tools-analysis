package java_classes.specs.statement_finders;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.Specification;
import java_classes.specs.SubjectClass;

/**
 * The {@code ReturnStatementFinder} class identifies return statements and generates
 * insertion requests for assertions containing postconditions.
 *
 * <p>If the method being processed is a void method, an insertion request
 * is generated with the position of the end of the method body. For non-void methods,
 * the class finds each return statement in the method body, creates postcondition assertions
 * based on the contents of the return statement, and generates insertion requests at the
 * locations of these return statements.
 */
public class ReturnStatementFinder extends StatementFinder {

    /**
     * Constructs a ReturnStatementFinder with the specified subject class,
     * JML syntax translator, and postcondition specification.
     *
     * @param subjectClass the class containing the method to process
     * @param jmlTranslator the translator for converting JML to Java
     * @param spec the specification containing the postcondition to insert
     */
    public ReturnStatementFinder(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator, Specification spec) {
        super(subjectClass, jmlTranslator, spec);
    }

    /**
     * Finds the insertion points for postcondition assertions based on the method's return statements.
     *
     * <p>If the method is void, an assertion is generated for the end of the method. Otherwise,
     * assertions are created at each return statement.
     *
     * @return an {@link InsertionRequestsList} containing insertion requests for postcondition assertions
     */
    public InsertionRequestsList find() {
        if (subjectClass.isVoidMethod())
            return getInsertionRequestAtEnd();
        else
            return getInsertionRequest();
    }

    /**
     * Generates an insertion request for the postcondition at the end of a void method.
     *
     * <p>The postcondition is translated to Java syntax and wrapped in an assert statement
     * to be inserted at the end of the method body.
     *
     * @return an {@link InsertionRequestsList} with a single request for the end of the method
     */
    private InsertionRequestsList getInsertionRequestAtEnd() {
        String postCondition = specification.getPostCondition();
        postCondition = jmlTranslator.toJavaFormat(postCondition);
        String copy = getPostConditionCopy(postCondition);
        InsertionRequestsList insertions = new InsertionRequestsList();
        NodeList<Statement> body = subjectClass.getMethodBody();
        insertions.add(body, body.size(), copy);
        return insertions;
    }

    /**
     * Creates insertion requests for each return statement in a non-void method.
     *
     * <p>The postcondition, translated with respect to each return statement,
     * is wrapped in assert statements, which are included in the returned list.
     *
     * @return an {@link InsertionRequestsList} containing insertion requests for each return statement
     */
    private InsertionRequestsList getInsertionRequest() {
        NodeList<Statement> body = subjectClass.getMethodBody();
        return createCopies(body);
    }

    /**
     * Finds return statements within the method body and generates insertion requests
     * to add assert statements based on the postcondition.
     *
     * @param body the list of statements in the method body
     * @return an {@link InsertionRequestsList} with insertion requests for each return statement found
     */
    protected InsertionRequestsList findPositionsToCopy(NodeList<Statement> body) {
        InsertionRequestsList insertions = new InsertionRequestsList();
        int pos = 0;
        for (Statement s : body) {
            if (s.isReturnStmt()) {
                String copy = createCopy(s);
                insertions.add(body, pos, copy);
            }
            pos++;
        }

        return insertions;
    }

    /**
     * Creates an assertion statement for a specific return statement's postcondition.
     *
     * <p>The method translates the postcondition in the context of the provided return
     * statement, incorporating {@code \result}, and returns the postcondition
     * wrapped as an assert statement.
     *
     * @param stmt the return statement to base the postcondition assertion on
     * @return a string containing the assert statement for the postcondition
     */
    private String createCopy(Statement stmt) {
        ReturnStmt returnStmt = stmt.asReturnStmt();
        String postCondition = specification.getPostCondition();
        postCondition = jmlTranslator.toJavaFormat(returnStmt, postCondition);
        return getPostConditionCopy(postCondition);
    }

    /**
     * Wraps a postcondition string in an assert statement for insertion.
     *
     * @param postCondition the postcondition to assert, formatted in Java syntax
     * @return the postcondition as an assert statement string
     */
    private String getPostConditionCopy(String postCondition) {
        return RawCodeCreator.createAssertStatement(postCondition);
    }
}