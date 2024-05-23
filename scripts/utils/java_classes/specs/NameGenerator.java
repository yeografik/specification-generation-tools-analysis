package java_classes.specs;

import java.util.HashSet;
import java.util.Set;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;

public class NameGenerator {

    private static Set<String> usedVariableNames;
    private static SubjectClass subjectClass;
    
    public static void SetSubjectClass(SubjectClass subject) {
        subjectClass = subject;
        setUsedVariableNames();
    }

    public static String newVariableNameFor(String var) {
        String baseName = "old_" + var;
        String finalName = findUsableName(baseName);
        usedVariableNames.add(finalName);

        return finalName;
    }
    
    public static String newVariableNameFor(String[] expr) {
        String partialName = buildPartialName(expr);
        return newVariableNameFor(partialName);
    }

    private static String buildPartialName(String[] expression) {
        int last = expression.length -1;
        return expression[0] + "_" + expression[last];
    }

    private static String findUsableName(String baseName) {
        String finalName = baseName;
        int num = 1;
        while (usedVariableNames.contains(finalName))
            finalName = baseName + "_" + num++;

        return finalName;
    }

    private static void setUsedVariableNames() {
        usedVariableNames = new HashSet<>();
        collectAttributeNames();
        collectParameterNames();
        collectVariableNames();
    }

    private static void collectAttributeNames() {
        CompilationUnit cu = subjectClass.getCompilationUnit();
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                usedVariableNames.add(variable.getNameAsString());
    }

    private static void collectParameterNames() {
        MethodDeclaration method = subjectClass.getMethod();
        for (Parameter p : method.getParameters())
        usedVariableNames.add(p.getNameAsString());
    }
    
    private static void collectVariableNames() {
        MethodDeclaration method = subjectClass.getMethod();
        for (VariableDeclarationExpr varDecl : method.findAll(VariableDeclarationExpr.class))
            for (VariableDeclarator var : varDecl.getVariables())
                usedVariableNames.add(var.getNameAsString());
    }
}