package java_classes.specs;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.statement_finders.InsertionRequest;
import java_classes.specs.statement_finders.InsertionRequestsList;
import java_classes.specs.statement_finders.StatementFinder;
import java_classes.specs.statement_finders.factory.StatementFinderFactory;

public class ClassManipulator {
    
    private SubjectClass subjectClass;
    private VariablesToDuplicate variablesToDuplicate;
    private Specification specification;
    private Inserter inserter;
    private DaikonSyntaxTranslator daikonTranslator;
    private StatementFinderFactory statementFinderFactory;
    
    public ClassManipulator(SubjectClass subjectClass, VariablesToDuplicate varsToDuplicate, Specification spec) {
        this.subjectClass = subjectClass;
        this.variablesToDuplicate = varsToDuplicate;
        this.daikonTranslator = new DaikonSyntaxTranslator(varsToDuplicate);
        this.inserter = new Inserter(subjectClass);
        this.specification = spec;
        this.statementFinderFactory = new StatementFinderFactory(subjectClass, daikonTranslator, spec);
    }
    
    public void copyOldVariables() {
        copyValuesOfInitializedOldVariables();
        InsertionRequestsList insertionList = findStatementsWith("OldVariableStatementFinder");
        inserter.insertStatements(insertionList);
    }
    
    public void insertPreCondition() {
        NodeList<Statement> body = subjectClass.getMethodBody();
        String preCondition = specification.getPreCondition();
        InsertionRequest InsertionRequest = new InsertionRequest(body, 0, preCondition);
        inserter.insertPrecondition(InsertionRequest);
    }
    
    public void insertPostConditions() {
        InsertionRequestsList insertionList = findStatementsWith("ReturnStatementFinder");
        inserter.insertStatements(insertionList);
    }
    
    private void copyValuesOfInitializedOldVariables() {
        InitializedVariableDuplicator duplicator = new InitializedVariableDuplicator(subjectClass, variablesToDuplicate, daikonTranslator);
        duplicator.duplicateParameters();
        duplicator.duplicateReferences();
        duplicator.duplicateComplexReferences();
    }

    private InsertionRequestsList findStatementsWith(String statementFinderClass) {
        StatementFinder oldVariableStmtFinder = statementFinderFactory.create(statementFinderClass);
        return oldVariableStmtFinder.find();
    }
}