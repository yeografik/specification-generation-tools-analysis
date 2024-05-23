package java_classes.specs.copy_generators;

import java.util.List;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

public class ReferenceCopyGenerator extends CopyGenerator {
    
    public ReferenceCopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
    }

    public List<String> copy(Object expression) {
        String expr = castParameter(expression);
        String newName = generateNewName(expr);
        daikonTranslator.addReplacement(expr, newName);
        String copy = createCopy(expr, newName);
        
        return copyAsList(copy);
    }

    private String castParameter(Object param) {
        if (param == null)
            throw new IllegalArgumentException("Parameter is null");
        
        String parameter = tryToCastParameter(param);
        return parameter;
    }

    private String tryToCastParameter(Object param) {
        String parameter;
        try {
            parameter = (String) param;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("the given parameter is not an instance of String class, " + e.getMessage());
        }
        
        return parameter;
    }

    private String generateNewName(String expr) {
        String[] exprParts = getExpressionParts(expr);
        String newName = NameGenerator.newVariableNameFor(exprParts[0]);
        
        return newName;
    }

    private String createCopy(String expr, String newName) {
        String objectReferenceCopy = RawCodeCreator.createDeclaration("Object", newName, expr);
        return objectReferenceCopy;
    }
}