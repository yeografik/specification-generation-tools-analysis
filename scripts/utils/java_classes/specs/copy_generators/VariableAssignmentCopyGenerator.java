package java_classes.specs.copy_generators;

import java.util.List;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.stmt.ExpressionStmt;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.SubjectClass;

public class VariableAssignmentCopyGenerator extends CopyGenerator {
    
    public VariableAssignmentCopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
    }

    public List<String> copy(Object expression) {
        ExpressionStmt exprStmt = castParameter(expression);
        String assignmentCopy = copyAssignment(exprStmt);

        return copyAsList(assignmentCopy);
    }

    private ExpressionStmt castParameter(Object parameter) {
        if (parameter == null)
            throw new IllegalArgumentException("Parameter is null");
        
        ExpressionStmt expressionStmt = tryToCastParameter(parameter);
        return expressionStmt;
    }

    private ExpressionStmt tryToCastParameter(Object parameter) {
        ExpressionStmt expressionStmt;
        try {
            expressionStmt = (ExpressionStmt) parameter;
        } catch(ClassCastException e) {
            throw new IllegalArgumentException("the given parameter is not an instance of ExpressionStmt class, " + e.getMessage());
        }
        
        return expressionStmt;
    }

    private String copyAssignment(ExpressionStmt exprStmt) {
        Expression expr = exprStmt.getExpression();
        String varName = expr.asAssignExpr().getTarget().toString();
        String newName = NameGenerator.newVariableNameFor(varName);
        String value = expr.asAssignExpr().getValue().toString();
        String assignmentCopy = RawCodeCreator.createAssingment(newName, value);
        daikonTranslator.addReplacement(varName, newName);
        
        return assignmentCopy;
    }
}