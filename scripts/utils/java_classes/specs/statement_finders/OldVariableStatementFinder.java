package java_classes.specs.statement_finders;

import java.util.List;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.Specification;
import java_classes.specs.StatementDuplicationChecker;
import java_classes.specs.SubjectClass;
import java_classes.specs.copy_generators.CopyGenerator;
import java_classes.specs.copy_generators.factory.CopyGeneratorCacheFactory;
import java_classes.specs.copy_generators.factory.CopyGeneratorFactory;

public class OldVariableStatementFinder extends StatementFinder {
    
    private CopyGeneratorFactory copyGeneratorFactory;
    
    public OldVariableStatementFinder(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator, Specification spec) {
        super(subjectClass, daikonTranslator, spec);
        this.copyGeneratorFactory = new CopyGeneratorCacheFactory(subjectClass, daikonTranslator);
    }

    public InsertionRequestsList find() {
        NodeList<Statement> body = subjectClass.getMethodBody();
        InsertionRequestsList insertions = findAndCreateCopies(body);
        return insertions;
    }

    protected InsertionRequestsList findPositionsToCopy(NodeList<Statement> body) {
        InsertionRequestsList insertions = new InsertionRequestsList();
        int pos = 0;
        for (Statement s : body) {
            if (needsCopy(s)) {
                List<String> copies = createCopies(s);
                insertions.add(body, pos, copies);
            }
            pos++;
        }
        return insertions;
    }
    
    private boolean needsCopy(Statement stmt) {
        return isOldVariableAssignmentOrDeclaration(stmt);
    }

    private boolean isOldVariableAssignmentOrDeclaration(Statement s) {
        return StatementDuplicationChecker.isOldVarAssignment(s) 
            || StatementDuplicationChecker.isOldVarDeclaration(s);
    }

    private List<String> createCopies(Statement stmt) {
        String generatorClass;
        if (StatementDuplicationChecker.isOldVarAssignment(stmt))
            generatorClass = "VariableDeclarationCopyGenerator";
        else
            generatorClass = "VariableAssignmentCopyGenerator";

        List<String> copies = copyVariables(stmt, generatorClass);
        return copies;
    }

    private List<String> copyVariables(Statement stmt, String generatorClass) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create(generatorClass);
        return copyGenerator.copy(stmt.asExpressionStmt());
    }
}