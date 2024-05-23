package java_classes.specs.statement_finders;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.Specification;
import java_classes.specs.SubjectClass;

public class ReturnStatementFinder extends StatementFinder {
 
    public ReturnStatementFinder(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator, Specification spec) {
        super(subjectClass, daikonTranslator, spec);
    }

    public InsertionRequestsList find() {
        if (subjectClass.isVoidMethod())
            return getInsertionRequestAtEnd();
        else
            return getInsertionRequest();
    }

    private InsertionRequestsList getInsertionRequestAtEnd() {
        String postCondition = specification.getPostCondition();
        postCondition = daikonTranslator.toJavaFormat(postCondition);
        String copy = getPostConditionCopy(postCondition);
        InsertionRequestsList requests = new InsertionRequestsList();
        NodeList<Statement> body = subjectClass.getMethodBody();
        requests.add(body, body.size(), copy);
        return requests;
    }

    private InsertionRequestsList getInsertionRequest() {
        NodeList<Statement> body = subjectClass.getMethodBody();
        InsertionRequestsList insertions = findAndCreateCopies(body);
        return insertions;
    }

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

    private String createCopy(Statement stmt) {
        ReturnStmt returnStmt = stmt.asReturnStmt();
        String postCondition = specification.getPostCondition();
        postCondition = daikonTranslator.toJavaFormat(returnStmt, postCondition);
        return getPostConditionCopy(postCondition);
    }

    private String getPostConditionCopy(String postCondition) {
        return RawCodeCreator.createAssertStatement(postCondition);
    }
}