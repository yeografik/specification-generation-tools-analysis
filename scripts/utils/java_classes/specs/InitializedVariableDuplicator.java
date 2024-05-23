package java_classes.specs;

import java.util.List;
import java.util.Set;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.stmt.Statement;

import java_classes.specs.copy_generators.CopyGenerator;
import java_classes.specs.copy_generators.factory.CopyGeneratorCacheFactory;
import java_classes.specs.copy_generators.factory.CopyGeneratorFactory;
import java_classes.specs.statement_finders.InsertionRequestsList;

public class InitializedVariableDuplicator {

    private SubjectClass subjectClass;
    private VariablesToDuplicate variablesToDuplicate;
    private Inserter inserter;
    private CopyGeneratorFactory copyGeneratorFactory;
    private DaikonSyntaxTranslator daikonTranslator;
    
    public InitializedVariableDuplicator(SubjectClass subjectClass, VariablesToDuplicate varsToDuplicate, DaikonSyntaxTranslator daikonTranslator) {
        this.subjectClass = subjectClass;
        this.variablesToDuplicate = varsToDuplicate;
        this.inserter = new Inserter(subjectClass);
        this.daikonTranslator = daikonTranslator;
        this.copyGeneratorFactory = new CopyGeneratorCacheFactory(subjectClass, daikonTranslator);
    }

    public void duplicateParameters() {
        NodeList<Parameter> parameters = subjectClass.getParameters();
        for (Parameter p : parameters)
            if (requiresDuplication(p))
                copyParameter(p);
        
        daikonTranslator.updateVariablesToDuplicate();
    }

    //crear la lista de inserciones y dps llamar al insertor con toda la lista completa
    public void duplicateReferences() {
        for (String refName : variablesToDuplicate.getReferences())
            if (StatementDuplicationChecker.isAttributeReference(refName))
                copyReference(refName, "AttributeCopyGenerator");
            else
                copyReference(refName, "ReferenceCopyGenerator");

        daikonTranslator.updateVariablesToDuplicate();
    }
    
    public void duplicateComplexReferences() {
        Set<String> variablesToClone = variablesToDuplicate.getComplexReferences();
        for (String ref : variablesToClone)
            copyComplexReference(ref);

        daikonTranslator.updateVariablesToDuplicate();
    }

    private boolean requiresDuplication(Parameter parameter) {
        String paramName = parameter.getNameAsString();
        return variablesToDuplicate.containsVariable(paramName);
    }

    private void copyParameter(Parameter param) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create("ParameterCopyGenerator");
        List<String> copies = copyGenerator.copy(param);
        InsertionRequestsList requests = createInsertionRequestsList(copies, 1);
        inserter.insertStatements(requests);
    }

    private void copyReference(String name, String generatorClass) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create(generatorClass);
        List<String> copies = copyGenerator.copy(name);
        InsertionRequestsList requests = createInsertionRequestsList(copies, 1);
        inserter.insertStatements(requests);
    }

    private void copyComplexReference(String reference) {
        CopyGenerator copyGenerator = copyGeneratorFactory.create("ComplexReferenceCopyGenerator");
        List<String> copies = copyGenerator.copy(reference);
        InsertionRequestsList requests = createInsertionRequestsList(copies, 1);
        inserter.insertStatements(requests);
    }

    private InsertionRequestsList createInsertionRequestsList(List<String> copies, int position) {
        InsertionRequestsList requests = new InsertionRequestsList();
        NodeList<Statement> body = subjectClass.getMethodBody();
        for (String copy : copies)
            requests.add(body, position, copy);
        return requests;
    }

}