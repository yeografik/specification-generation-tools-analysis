package java_classes.specs.copy_generators.factory;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.SubjectClass;
import java_classes.specs.copy_generators.CopyGenerator;
import java_classes.specs.copy_generators.CopyGeneratorType;

/**
 * Abstract factory for creating instances of {@link CopyGenerator}.
 *
 * <p>This factory defines methods to create {@code CopyGenerator} instances
 * either by specifying a class name or an enumeration type.
 * Subclasses should implement the specific creation logic for different types
 * of {@code CopyGenerator} objects.
 */
public abstract class CopyGeneratorFactory {

    protected SubjectClass subjectClass;
    protected JMLSyntaxTranslator jmlTranslator;

    /**
     * Constructs a new {@code CopyGeneratorFactory} with the specified subject class
     * and JML syntax translator.
     *
     * @param subjectClass the subject class for which copies will be generated
     * @param jmlTranslator the translator to convert JML syntax in the statements
     */
    public CopyGeneratorFactory(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator) {
        this.subjectClass = subjectClass;
        this.jmlTranslator = jmlTranslator;
    }

    /**
     * Creates a {@code CopyGenerator} based on the provided type.
     *
     * <p>This method should map the {@code CopyGeneratorType} to a specific
     * {@code CopyGenerator} implementation.
     *
     * @param type the type of copy generator to create
     * @return a {@code CopyGenerator} instance for the specified type
     * @throws IllegalArgumentException if the type does not match a known generator type
     */
    public abstract CopyGenerator create(CopyGeneratorType type);
}