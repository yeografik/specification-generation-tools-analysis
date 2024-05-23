package java_classes.specs.copy_generators;

import java.util.LinkedList;
import java.util.List;

import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.NameGenerator;
import java_classes.specs.RawCodeCreator;
import java_classes.specs.StatementDuplicationChecker;
import java_classes.specs.SubjectClass;

public class VariableDeclarationCopyGenerator extends CopyGenerator {
    
    public VariableDeclarationCopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
    }

    public List<String> copy(Object expression) {
        List<String> copies = new LinkedList<>();
        VariableDeclarationExpr varDeclExpr = getVariableDeclarationExpression(expression);
        for (VariableDeclarator var : varDeclExpr.getVariables())
            if (needsCopy(var))
                addCopy(var, copies);
        
        return copies;
    }

    private VariableDeclarationExpr getVariableDeclarationExpression(Object expression) {
        ExpressionStmt exprStmt = castParameter(expression);
        Expression expr = exprStmt.getExpression();
        return expr.asVariableDeclarationExpr();
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
    
    private boolean needsCopy(VariableDeclarator var) {
        String varName = var.getNameAsString();
        return StatementDuplicationChecker.isOldVarInitializer(varName, var);
    }

    private void addCopy(VariableDeclarator var, List<String> copies) {
        String varName = var.getNameAsString();
        String newName = NameGenerator.newVariableNameFor(varName);
        String varInitializer = var.getInitializer().get().toString();
        String assignmentCopy = RawCodeCreator.createAssingment(newName, varInitializer);
        daikonTranslator.addReplacement(varName, newName);
        String copy = assignmentCopy;
        copies.add(copy);
    }
}