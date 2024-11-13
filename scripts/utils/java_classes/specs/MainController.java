package java_classes.specs;

import com.github.javaparser.ast.CompilationUnit;
import java_classes.specs.checker.JMLStatementChecker;

import java.util.Optional;

/**
 * The main controller class responsible for inserting preconditions and postconditions
 * into a specified method within a Java class. This class orchestrates the setup and
 * manipulation of the Java source code to include assertions as specified by the user.

 * <p>Command-line arguments:
 * <ul>
 *   <li>arg[0]: Path to the Java class</li>
 *   <li>arg[1]: Class name</li>
 *   <li>arg[2]: Method name</li>
 *   <li>arg[3]: Precondition to insert</li>
 *   <li>arg[4]: Postcondition to insert</li>
 * </ul>
 */
public class MainController {

    private static final int minArgs = 5;
    private static SubjectClass subjectClass;
    private static Specification spec;
    private static VariablesToDuplicate variablesToDuplicate;
    private static ClassManipulator classManipulator;

    /**
     * The main entry point for the program. Validates arguments and sets up the necessary
     * classes to insert the precondition and postcondition assertions into the target
     * Java method.
     *
     * @param args command-line arguments as specified in the class-level documentation
     */
    public static void main(String[] args) {
        validateArguments(args);
        setUpClasses(args);

        classManipulator.duplicateOldVariables();
        classManipulator.insertPostConditions();
        classManipulator.insertPreCondition();
        
        saveFile();
    }

    /**
     * Validates that the arguments provided via command-line meet the minimum amount.
     *
     * @param cmdArgs the array of command-line arguments
     * @throws IllegalArgumentException if the number of arguments is less than the required minimum
     */
    private static void validateArguments(String[] cmdArgs) {
        if (cmdArgs.length < minArgs)
            throw new IllegalArgumentException("Insufficient arguments provided, expected at least " + minArgs + ", but received " + cmdArgs.length + "\n");
    }

    /**
     * Initializes and sets up all required classes for processing the target Java class
     * and method.
     *
     * @param args the array of command-line arguments
     */
    private static void setUpClasses(String[] args) {
        setSubjectClass(args);
        setNameGenerator();
        setSpecification(args);
        setVariablesToDuplicate();
        setJMLStatementChecker();
        setClassManipulator();
    }

    /**
     * Sets the subject class that will be manipulated based on the command-line arguments.
     *
     * @param cmdArgs the array of command-line arguments
     */
    private static void setSubjectClass(String[] cmdArgs) {
        subjectClass = new SubjectClass(cmdArgs[0], cmdArgs[1], cmdArgs[2]);
    }

    /**
     * Configures the name generator with the current subject class to ensure variable name
     * uniqueness during manipulation.
     */
    private static void setNameGenerator() {
        NameGenerator.setSubjectClass(subjectClass);
    }

    /**
     * Sets the specification containing the precondition and postcondition for insertion.
     *
     * @param cmdArgs the array of command-line arguments
     */
    private static void setSpecification(String[] cmdArgs) {
        spec = new Specification(cmdArgs[3], cmdArgs[4]);
    }

    /**
     * Initializes the {@code VariablesToDuplicate} object based on the provided specification.
     */
    private static void setVariablesToDuplicate() {
        variablesToDuplicate = new VariablesToDuplicate(spec);
    }

    /**
     * Configures the JML statement checker with the variables to duplicate.
     */
    private static void setJMLStatementChecker() {
        JMLStatementChecker.setVariablesToDuplicate(variablesToDuplicate);
    }

    /**
     * Initializes the class manipulator with the current subject class, specification,
     * and variables to duplicate.
     */
    private static void setClassManipulator() {
        classManipulator = new ClassManipulator(subjectClass, variablesToDuplicate, spec);
    }

    /**
     * Saves the modified Java class to its storage location.
     */
    private static void saveFile() {
        CompilationUnit cu = subjectClass.getCompilationUnit();
        Optional<CompilationUnit.Storage> storage = cu.getStorage();
        if (!storage.isPresent()) {
            throw new IllegalStateException("Failed to save: Storage not found in compilation unit");
        }
        storage.get().save();
    }
}
