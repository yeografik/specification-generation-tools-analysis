package java_classes.specs.copy_generators.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.SubjectClass;
import java_classes.specs.copy_generators.*;

/**
 * Factory implementation for creating and caching instances of {@link CopyGenerator}.
 *
 * <p>This factory caches each {@code CopyGenerator} instance upon creation,
 * reusing it for future requests. It supports creation based on {@link CopyGeneratorType}
 * and dynamically instantiates generators using reflection.
 */
public class CopyGeneratorCacheFactory extends CopyGeneratorFactory {

    private final Map<String,CopyGenerator> generators;

    /**
     * Constructs a new {@code CopyGeneratorCacheFactory} with the specified subject class
     * and JML syntax translator.
     *
     * @param subjectClass the subject class for which copies will be generated
     * @param jmlTranslator the translator to convert JML syntax within the statements
     */
    public CopyGeneratorCacheFactory(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        super(subjectClass, jmlTranslator);
        generators = new HashMap<>();
    }

    /**
     * Creates or retrieves a {@code CopyGenerator} based on the provided type.
     *
     * <p>This method uses an internal cache to store previously created generators
     * and only instantiates a new generator if one has not yet been created for
     * the specified type.
     *
     * @param type the type of copy generator to create or retrieve
     * @return a cached or newly created {@code CopyGenerator} instance
     * @throws IllegalArgumentException if the type does not match a known generator type
     */
    public CopyGenerator create(CopyGeneratorType type) {
        switch(type) {
            case PARAMETER:
                return getGenerator(ParameterCopyGenerator.class);
            case ATTRIBUTE:
                return getGenerator(AttributeCopyGenerator.class);
            case SIMPLE_REFERENCE:
                return getGenerator(ReferenceCopyGenerator.class);
            case DAIKON_ARGUMENT:
                return getGenerator(DaikonArgumentCopyGenerator.class);
            case VARIABLE_ASSIGNMENT:
                return getGenerator(VariableAssignmentCopyGenerator.class);
            case VARIABLE_DECLARATION:
                return getGenerator(VariableDeclarationCopyGenerator.class);
            default:
                throw new IllegalArgumentException(type + " is not a valid CopyGenerator class");
        }
    }

    /**
     * Retrieves a cached generator or creates a new instance if it has not been cached.
     *
     * @param classname the class of the copy generator to retrieve or create
     * @return a cached or newly instantiated {@code CopyGenerator}
     */
    private CopyGenerator getGenerator(Class<? extends CopyGenerator> classname) {
        cacheGeneratorIfAbsent(classname);
        String classnameString = classname.getName();
        return generators.get(classnameString);
    }

    /**
     * Ensures that a generator instance for the given class has been created and cached.
     *
     * <p>If the generator has not been cached, it is created and added to the cache.
     *
     * @param classname the class of the copy generator to instantiate and cache
     */
    private void cacheGeneratorIfAbsent(Class<? extends CopyGenerator> classname) {
        String classnameString = classname.getName();
        if (!generators.containsKey(classnameString)) {
            CopyGenerator generator = createGeneratorClass(classname);
            generators.put(classnameString, generator);
        }
    }

    /**
     * Instantiates a copy generator using reflection.
     *
     * <p>This method requires that each generator class has a constructor that accepts
     * a {@code SubjectClass} and {@code JMLSyntaxTranslator} as arguments.
     *
     * @param generatorClass the class of the copy generator to instantiate
     * @return a new instance of the specified {@code CopyGenerator} class
     * @throws RuntimeException if the generator class cannot be instantiated
     */
    private CopyGenerator createGeneratorClass(Class<? extends CopyGenerator> generatorClass) {
        CopyGenerator generatorInstance = null;
        try {
            Constructor<? extends CopyGenerator> constructor = generatorClass.getConstructor(SubjectClass.class,
                    JMLSyntaxTranslator.class);
            generatorInstance = constructor.newInstance(subjectClass, jmlTranslator);
            return generatorInstance;
        } catch (Exception e) {
            System.out.println("Something went wrong during CopyGenerator class instantiation");
            e.printStackTrace();
        }
        return generatorInstance;
    }
}