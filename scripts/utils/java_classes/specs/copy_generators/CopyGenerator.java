package java_classes.specs.copy_generators;

import java.util.LinkedList;
import java.util.List;

import com.github.javaparser.ast.type.Type;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.SubjectClass;

public abstract class CopyGenerator {

    protected SubjectClass subjectClass;
    protected DaikonSyntaxTranslator daikonTranslator;
    
    public CopyGenerator(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        this.subjectClass = subjectClass;
        this.daikonTranslator = daikonTranslator;
    }

    public abstract List<String> copy(Object statement);

    protected Type getExpressionType(String[] exprParts) {
        String lastPart = exprParts[exprParts.length -1];
        return subjectClass.getAttributeType(lastPart);
    }

    protected String[] getExpressionParts(String expr) {
        return expr.split("\\.");
    }

    protected List<String> copyAsList(String copy) {
        List<String> copies = new LinkedList<>();
        copies.add(copy);
        return copies;
    }
}