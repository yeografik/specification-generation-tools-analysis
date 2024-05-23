package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.type.Type;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

public class AttributeCopyGenerator extends CopyGenerator {
    
    public AttributeCopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
    }

    public List<String> copy(Object expression) {
        String expr = castParameter(expression);
        String[] exprParts = getExpressionParts(expr);
        String newName = NameGenerator.newVariableNameFor(exprParts);
        
        Type type = getExpressionType(exprParts);
        String copy = copyAttribute(type, expr, newName);
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

    private String attributeAsComment(String expr, String newName) {
        System.out.println("attribute of expression " + expr + " is not part of the class, skipping");
        return "\\old(" + expr + "), something " + newName + " = " + expr + ";";
    }

    private String copyAttribute(Type type, String expr, String newName) {
        if (type == null)
            return attributeAsComment(expr, newName);
        
        String copy;
        if (type.isPrimitiveType())
            copy = RawCodeCreator.createDeclaration(type.asString(), newName, expr);
        else
            copy = RawCodeCreator.createDeclaration("Object", newName, expr);
        
        daikonTranslator.addReplacement(expr, newName);
        return copy;
    }
}