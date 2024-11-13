package java_classes.specs;

import java.util.List;
import java.util.Set;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.checker.JavaStatementChecker;
import java_classes.specs.copy_generators.CopyGenerator;
import java_classes.specs.copy_generators.CopyGeneratorType;
import java_classes.specs.copy_generators.factory.CopyGeneratorCacheFactory;
import java_classes.specs.copy_generators.factory.CopyGeneratorFactory;
import java_classes.specs.statement_finders.InsertionRequestsList;

/**
 * {@code VariableDuplicator} manages the duplication of parameters, references,
 * and Daikon function arguments to retain original values for runtime verification of
 * postconditions and other formal specifications.
 */
public class InitialStateDuplicator {

    private SubjectClass subjectClass;
    private VariablesToDuplicate variablesToDuplicate;
    private Inserter inserter;
    private CopyGeneratorFactory copyGeneratorFactory;
    private JMLSyntaxTranslator jmlTranslator;

    /**
     * Constructs a {@code VariableDuplicator} for managing the duplication
     * requirements of a given subject class.
     *
     * @param subjectClass       the class containing the method of interest where
     *                           variables needs to be duplicated.
     * @param varsToDuplicate    the collection of variables to be duplicated.
     * @param jmlTranslator      the JML translator for managing expression translations.
     */
    public InitialStateDuplicator(SubjectClass subjectClass, VariablesToDuplicate varsToDuplicate,
                                  JMLSyntaxTranslator jmlTranslator) {
        this.subjectClass = subjectClass;
        this.variablesToDuplicate = varsToDuplicate;
        this.inserter = new Inserter(subjectClass);
        this.jmlTranslator = jmlTranslator;
        this.copyGeneratorFactory = new CopyGeneratorCacheFactory(subjectClass, jmlTranslator);
    }

    /**
     * Duplicates method parameters listed in the {@code variablesToDuplicate} collection
     * to preserve their original values for later runtime validation in postconditions.
     *
     * <p>Uses the {@code JMLSyntaxTranslator} to manage translated variable names as needed.
     */
    public void duplicateParameters() {
        NodeList<Parameter> parameters = subjectClass.getParameters();
        for (Parameter p : parameters)
            if (requiresDuplication(p))
                copyParameter(p);
        
        jmlTranslator.updateVariablesToDuplicate();
    }

    /**
     * Duplicates references, such as object fields or attributes, specified in the
     * {@code variablesToDuplicate} collection, enabling value preservation for assertions.
     *
     * <p>Determines whether a reference is an attribute or a simple reference and applies
     * the appropriate duplication strategy.
     */
    public void duplicateReferences() {
        for (String refName : variablesToDuplicate.getReferences())
            if (JavaStatementChecker.isAttributeReference(refName))
                copyReference(refName, CopyGeneratorType.ATTRIBUTE);
            else
                copyReference(refName, CopyGeneratorType.SIMPLE_REFERENCE);

        jmlTranslator.updateVariablesToDuplicate();
    }

    /**
     * Duplicates arguments used in Daikon function calls to preserve their original
     * values, supporting later verification within JML specifications.
     *
     * <p>The duplicated arguments ensure accurate tracking of values in postconditions.
     */
    public void duplicateDaikonArguments() {
        Set<String> variablesToClone = variablesToDuplicate.getDaikonArguments();
        for (String ref : variablesToClone)
            copyDaikonArgument(ref);

        jmlTranslator.updateVariablesToDuplicate();
    }

    /**
     * Determines if a given parameter requires duplication by verifying its presence
     * in the {@code variablesToDuplicate} collection.
     *
     * @param parameter  the parameter to check.
     * @return {@code true} if the parameter needs duplication, otherwise {@code false}.
     */
    private boolean requiresDuplication(Parameter parameter) {
        String paramName = parameter.getNameAsString();
        return variablesToDuplicate.containsVariable(paramName);
    }

    /**
     * Creates a duplicate of the specified parameter and inserts the copy at an
     * appropriate location within the class structure.
     *
     * @param param  the parameter to duplicate.
     */
    private void copyParameter(Parameter param) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create(CopyGeneratorType.PARAMETER);
        List<String> copies = copyGenerator.copy(param);
        InsertionRequestsList requests = createInsertionRequestsList(copies, 0);
        inserter.insertStatements(requests);
    }

    /**
     * Duplicates the specified reference by using the provided type of copy generator,
     * then inserts the copy into the class structure.
     *
     * @param name           the name of the reference to duplicate.
     * @param generatorType  the type of copy generator to apply.
     */
    private void copyReference(String name, CopyGeneratorType generatorType) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create(generatorType);
        List<String> copies = copyGenerator.copy(name);
        InsertionRequestsList requests = createInsertionRequestsList(copies, 0);
        inserter.insertStatements(requests);
    }

    /**
     * Duplicates a Daikon function argument, preserving its state to allow accurate
     * runtime tracking and comparison for specification verification.
     *
     * @param reference  the Daikon argument reference to duplicate.
     */
    private void copyDaikonArgument(String reference) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create(CopyGeneratorType.DAIKON_ARGUMENT);
        List<String> copies = copyGenerator.copy(reference);
        InsertionRequestsList requests = createInsertionRequestsList(copies, 0);
        inserter.insertStatements(requests);
    }

    /**
     * Generates an {@code InsertionRequestsList} for inserting the specified list of copies
     * at a designated position within the subject class’s method body.
     *
     * @param copies    the list of copy statements to insert.
     * @param position  the position within the method body for insertion.
     * @return an {@code InsertionRequestsList} prepared for statement insertion.
     */
    private InsertionRequestsList createInsertionRequestsList(List<String> copies, int position) {
        InsertionRequestsList requests = new InsertionRequestsList();
        NodeList<Statement> body = subjectClass.getMethodBody();
        for (String copy : copies)
            requests.add(body, position, copy);
        return requests;
    }

}