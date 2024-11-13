package java_classes.specs.statement_finders;

import java.util.List;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.Specification;
import java_classes.specs.checker.JMLStatementChecker;
import java_classes.specs.SubjectClass;
import java_classes.specs.copy_generators.CopyGenerator;
import java_classes.specs.copy_generators.CopyGeneratorType;
import java_classes.specs.copy_generators.factory.CopyGeneratorCacheFactory;
import java_classes.specs.copy_generators.factory.CopyGeneratorFactory;

/**
 * The {@code OldVariableStatementFinder} class identifies positions in the code where old variable declarations
 * or assignments occur and generates insertion requests for variable copies.
 *
 * <p>This class leverages a {@link CopyGenerator} to produce the necessary copies, based on
 * the types of statements found. It is part of the statement-finding functionality tailored
 * to handle JML-specific variable declarations and assignments.
 */
public class OldVariableStatementFinder extends StatementFinder {
    
    private final CopyGeneratorFactory copyGeneratorFactory;

    /**
     * Constructs an {@code OldVariableStatementFinder} with the specified subject class, JML translator,
     * and specification.
     *
     * @param subjectClass the class under analysis for old variable statements
     * @param jmlTranslator the JML syntax translator
     * @param spec the specification associated with the class
     */
    public OldVariableStatementFinder(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator, Specification spec) {
        super(subjectClass, jmlTranslator, spec);
        this.copyGeneratorFactory = new CopyGeneratorCacheFactory(subjectClass, jmlTranslator);
    }

    /**
     * Finds positions of interest within the method body for old variable statements and creates insertion requests.
     *
     * @return an {@link InsertionRequestsList} containing positions and copy statements for old variable declarations
     * and assignments
     */
    public InsertionRequestsList find() {
        NodeList<Statement> body = subjectClass.getMethodBody();
        return createCopies(body);
    }

    /**
     * Finds the positions in the provided body of statements where copies should be created.
     * Each statement that needs a copy will result in one or more insertion requests.
     *
     * @param body the body of statements to inspect
     * @return an {@link InsertionRequestsList} with positions for copies
     */
    protected InsertionRequestsList findPositionsToCopy(NodeList<Statement> body) {
        InsertionRequestsList insertions = new InsertionRequestsList();
        int pos = 0;
        for (Statement s : body) {
            if (needsCopy(s)) {
                List<String> copies = copyStatement(s);
                insertions.add(body, pos, copies);
            }
            pos++;
        }
        return insertions;
    }

    /**
     * Checks whether the provided statement is a declaration or assignment of an "old" variable
     * that requires copying.
     *
     * @param stmt the statement to check
     * @return {@code true} if the statement requires a copy, otherwise {@code false}
     */
    private boolean needsCopy(Statement stmt) {
        return JMLStatementChecker.isOldVarAssignment(stmt)
                || JMLStatementChecker.isOldVarDeclaration(stmt);
    }

    /**
     * Determines the appropriate copy generator class for the given statement and generates
     * the necessary copies.
     *
     * @param stmt the statement requiring copies
     * @return a list of copy statements as {@code String}s
     */
    private List<String> copyStatement(Statement stmt) {
        CopyGeneratorType generatorType;
        if (JMLStatementChecker.isOldVarAssignment(stmt))
            generatorType = CopyGeneratorType.VARIABLE_ASSIGNMENT;
        else
            generatorType = CopyGeneratorType.VARIABLE_DECLARATION;

        return copyVariables(stmt, generatorType);
    }

    /**
     * Uses a {@link CopyGenerator} to create copies of the provided statement.
     *
     * @param stmt the statement to copy
     * @param generatorType the name of the generator class responsible for creating the copy
     * @return a list of copied statements as {@code String}s
     */
    private List<String> copyVariables(Statement stmt, CopyGeneratorType generatorType) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create(generatorType);
        return copyGenerator.copy(stmt.asExpressionStmt());
    }
}