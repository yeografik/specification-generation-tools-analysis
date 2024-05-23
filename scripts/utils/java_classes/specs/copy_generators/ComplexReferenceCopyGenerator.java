package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.type.Type;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

public class ComplexReferenceCopyGenerator extends CopyGenerator {
    
    public ComplexReferenceCopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
    }

    public List<String> copy(Object expression) {
        String expr = castParameter(expression);
        String[] exprParts = getExpressionParts(expr);
        String newName = NameGenerator.newVariableNameFor(exprParts);
        Type type = getExpressionType(exprParts);

        String copy = copyObjectClone(type, expr, newName);
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

    private String copyObjectAsComment(String expr, String newName) {
        System.out.println("expression " + expr + " is not an attribute of the class or is a method call, skipping");
        return "\\old(daikon.Quant.size(" + expr + ")), daikon.Quant.size(" + newName + ")";
    }

    private String copyObjectClone(Type type, String expr, String newName) {
        if (type == null) {
            return copyObjectAsComment(expr, newName);
        }
        
        String cloneExpr = expr + ".attributeCopy()";
        String cloneStatement = RawCodeCreator.createDeclaration(type.asString(), newName, cloneExpr);
        daikonTranslator.addDaikonFunctionReplacement(expr, newName, "daikon.Quant.size");
        return cloneStatement;
    }

}