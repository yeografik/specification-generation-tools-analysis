package java_classes.specs.statement_finders;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithBody;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.Specification;
import java_classes.specs.SubjectClass;

public abstract class StatementFinder {
 
    protected SubjectClass subjectClass;
    protected DaikonSyntaxTranslator daikonTranslator;
    protected Specification specification;
    
    public StatementFinder(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator, Specification spec) {
        this.subjectClass = subjectClass;
        this.daikonTranslator = daikonTranslator;
        this.specification = spec;
    }

    public abstract InsertionRequestsList find();
    
    protected InsertionRequestsList findAndCreateCopies(NodeList<Statement> body) {
        InsertionRequestsList insertionList = findPositionsToCopy(body);
        InsertionRequestsList compositeInsertionList = checkCompositeStatements(body);
        insertionList.addInsertionList(compositeInsertionList);
        
        return insertionList;
    }

    protected abstract InsertionRequestsList findPositionsToCopy(NodeList<Statement> body);

    protected InsertionRequestsList checkCompositeStatements(NodeList<Statement> body) {
        InsertionRequestsList insertionList = new InsertionRequestsList();
        for (Statement s : body) {
            InsertionRequestsList compositeInsertionList = checkCompositeStatement(s);
            insertionList.addInsertionList(compositeInsertionList);
        }
        return insertionList;
    }

    protected InsertionRequestsList checkCompositeStatement(Statement s) {
        if (s instanceof NodeWithStatements<?>)
            return findAndCreateCopies(((NodeWithStatements<?>)s).getStatements());
        else if (s instanceof NodeWithBody<?>)
            return checkCompositeStatement(((NodeWithBody<?>)s).getBody());
        else if (s.isIfStmt())
            return checkIfStmt(s.asIfStmt());
        else if (s instanceof NodeWithBlockStmt<?>)
            return findAndCreateCopies(((NodeWithBlockStmt<?>)s).getBody().getStatements());
        else if (s.isTryStmt())
            return findAndCreateCopies(s.asTryStmt().getTryBlock().getStatements());
        else
            return new InsertionRequestsList();
    }

    protected InsertionRequestsList checkIfStmt(IfStmt s) {
        InsertionRequestsList thenBlockList = checkThenBlock(s);
        InsertionRequestsList elseBlockList = checkElseBlock(s);
        thenBlockList.addInsertionList(elseBlockList);
        return elseBlockList;
    }

    protected InsertionRequestsList checkThenBlock(IfStmt s) {
        if(s.hasThenBlock())
            return checkCompositeStatement(s.getThenStmt());
        else
            return new InsertionRequestsList();
    }
    
    protected InsertionRequestsList checkElseBlock(IfStmt s) {
        if(s.hasThenBlock())
            return checkCompositeStatement(s.getThenStmt());
        else
            return new InsertionRequestsList();
    }

}