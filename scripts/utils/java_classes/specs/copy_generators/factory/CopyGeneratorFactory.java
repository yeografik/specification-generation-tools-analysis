package java_classes.specs.copy_generators.factory;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.SubjectClass;
import java_classes.specs.copy_generators.CopyGenerator;

public abstract class CopyGeneratorFactory {

    protected SubjectClass subjectClass;
    protected DaikonSyntaxTranslator daikonTranslator;
    
    public CopyGeneratorFactory(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        this.subjectClass = subjectClass;
        this.daikonTranslator = daikonTranslator;
    }

    public abstract CopyGenerator create(String classname);

}