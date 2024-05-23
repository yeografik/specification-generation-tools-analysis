package java_classes.specs.copy_generators.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import java_classes.specs.DaikonSyntaxTranslator;
import java_classes.specs.SubjectClass;
import java_classes.specs.copy_generators.AttributeCopyGenerator;
import java_classes.specs.copy_generators.ComplexReferenceCopyGenerator;
import java_classes.specs.copy_generators.CopyGenerator;
import java_classes.specs.copy_generators.ParameterCopyGenerator;
import java_classes.specs.copy_generators.ReferenceCopyGenerator;
import java_classes.specs.copy_generators.VariableAssignmentCopyGenerator;
import java_classes.specs.copy_generators.VariableDeclarationCopyGenerator;

public class CopyGeneratorCacheFactory extends CopyGeneratorFactory {

    private Map<String,CopyGenerator> generators;

    public CopyGeneratorCacheFactory(SubjectClass subjectClass, DaikonSyntaxTranslator daikonTranslator) {
        super(subjectClass, daikonTranslator);
        generators = new HashMap<>();
    }

    public CopyGenerator create(String classname) {
        switch(classname) {
            case "ParameterCopyGenerator":
                return getGenerator(ParameterCopyGenerator.class);
            case "AttributeCopyGenerator":
                return getGenerator(AttributeCopyGenerator.class);
            case "ReferenceCopyGenerator":
                return getGenerator(ReferenceCopyGenerator.class);
            case "ComplexReferenceCopyGenerator":
                return getGenerator(ComplexReferenceCopyGenerator.class);
            case "VariableAssignmentCopyGenerator":
                return getGenerator(VariableAssignmentCopyGenerator.class);
            case "VariableDeclarationCopyGenerator":
                return getGenerator(VariableDeclarationCopyGenerator.class);
            default:
                throw new IllegalArgumentException(classname + " is not a valid CopyGenerator class");
        }
    }

    private CopyGenerator getGenerator(Class<? extends CopyGenerator> classname) {
        createIfNotInstantiated(classname);
        String classnameString = classname.getName();
        return generators.get(classnameString);
    }

    private void createIfNotInstantiated(Class<? extends CopyGenerator> classname) {
        String classnameString = classname.getName();
        if (!generators.containsKey(classnameString)) {
            CopyGenerator generator = createGeneratorClass(classname);
            generators.put(classnameString, generator);
        }
    }

    private CopyGenerator createGeneratorClass(Class<? extends CopyGenerator> generatorClass) {
        CopyGenerator generatorInstance = null;
        try {
            Constructor<? extends CopyGenerator> constructor = generatorClass.getConstructor(SubjectClass.class, DaikonSyntaxTranslator.class);
            generatorInstance = constructor.newInstance(subjectClass, daikonTranslator);
            return generatorInstance;
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        return generatorInstance;
    }
}