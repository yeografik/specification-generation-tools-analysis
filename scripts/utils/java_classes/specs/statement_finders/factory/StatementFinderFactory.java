package java_classes.specs.statement_finders.factory;

import java_classes.specs.JMLSyntaxTranslator;
import java_classes.specs.Specification;
import java_classes.specs.SubjectClass;
import java_classes.specs.statement_finders.OldVariableStatementFinder;
import java_classes.specs.statement_finders.ReturnStatementFinder;
import java_classes.specs.statement_finders.StatementFinder;
import java_classes.specs.statement_finders.StatementFinderType;

import static java_classes.specs.statement_finders.StatementFinderType.OLD_VARIABLE_STATEMENT_FINDER;
import static java_classes.specs.statement_finders.StatementFinderType.RETURN_STATEMENT_FINDER;

/**
 * Factory class for creating instances of {@link StatementFinder}.
 * Provides a centralized way to create specific implementations of statement finders based on a class name.
 */
public class StatementFinderFactory {

    protected SubjectClass subjectClass;
    protected JMLSyntaxTranslator jmlTranslator;
    protected Specification specification;

    /**
     * Constructs a new {@code StatementFinderFactory} with the provided dependencies.
     *
     * @param subjectClass the {@link SubjectClass} instance representing the Java class being analyzed
     * @param jmlTranslator the {@link JMLSyntaxTranslator} used for translating JML statements to Java
     * @param spec the {@link Specification} containing the preconditions and postconditions to be processed
     */
    public StatementFinderFactory(SubjectClass subjectClass, JMLSyntaxTranslator jmlTranslator, Specification spec) {
        this.subjectClass = subjectClass;
        this.jmlTranslator = jmlTranslator;
        this.specification = spec;
    }

    /**
     * Creates and returns an instance of {@link StatementFinder} based on the specified class name.
     *
     * @param type the enum corresponding to the {@link StatementFinder} class to instantiate
     * @return an instance of {@link StatementFinder} corresponding to the provided class name
     * @throws IllegalArgumentException if the class name is not recognized
     */
    public StatementFinder create(StatementFinderType type) {
        switch(type) {
            case OLD_VARIABLE_STATEMENT_FINDER:
                return new OldVariableStatementFinder(subjectClass, jmlTranslator, specification);
            case RETURN_STATEMENT_FINDER:
                return new ReturnStatementFinder(subjectClass, jmlTranslator, specification);
            default:
                throw new IllegalArgumentException(type + " is not a valid StatementFinder class");
        }
    }
}