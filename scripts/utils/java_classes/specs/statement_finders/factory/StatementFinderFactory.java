package java_classes.specs.statement_finders.factory;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.Specification;
import java_classes.specs.SubjectClass;
import java_classes.specs.statement_finders.OldVariableStatementFinder;
import java_classes.specs.statement_finders.ReturnStatementFinder;
import java_classes.specs.statement_finders.StatementFinder;

public class StatementFinderFactory {

    protected SubjectClass subjectClass;
    protected DaikonSyntaxTranslator daikonTranslator;
    protected Specification specification;
    
    public StatementFinderFactory(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator, Specification spec) {
        this.subjectClass = subjectClass;
        this.daikonTranslator = daikonTranslator;
        this.specification = spec;
    }

    public StatementFinder create(String classname) {
        switch(classname) {
            case "OldVariableStatementFinder":
                return new OldVariableStatementFinder(subjectClass, daikonTranslator, specification);
            case "ReturnStatementFinder":
                return new ReturnStatementFinder(subjectClass, daikonTranslator, specification);
            default:
                throw new IllegalArgumentException(classname + " is not a valid StatementFinder class");
        }
    }
}