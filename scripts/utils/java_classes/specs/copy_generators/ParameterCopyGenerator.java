package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.body.Parameter;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

public class ParameterCopyGenerator extends CopyGenerator {

    public ParameterCopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
    }

    public List<String> copy(Object param) {
        Parameter parameter = castParameter(param);
        String copy = createParameterCopy(parameter);
        
        return copyAsList(copy);
    }

    private Parameter castParameter(Object param) {
        if (param == null)
            throw new IllegalArgumentException("Parameter is null");
        
        Parameter parameter = tryToCastParameter(param);
        return parameter;
    }

    private Parameter tryToCastParameter(Object param) {
        Parameter parameter;
        try {
            parameter = (Parameter) param;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("the given parameter is not an instance of Parameter class, " + e.getMessage());
        }
        
        return parameter;
    }

    private String createParameterCopy(Parameter parameter) {
        String paramName = parameter.getNameAsString();
        String newName = NameGenerator.newVariableNameFor(paramName);
        String type = parameter.getTypeAsString();
        String assignmentCopy = RawCodeCreator.createDeclaration(type, newName, paramName);
        daikonTranslator.addReplacement(paramName, newName);
        
        return assignmentCopy;
    }
}