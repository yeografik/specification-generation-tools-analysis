package java_classes.specs;

import com.github.javaparser.ast.CompilationUnit;

/*
 * Inserts given assertion before return statement in the given method
 * arg 0: path to java class
 * arg 1: class name
 * arg 2: method name
 * arg 3: precondition to insert
 * arg 4: postcondition to insert
 */
public class MainController {

    private static final int minArgs = 5;
    private static SubjectClass subjectClass;
    private static Specification spec;
    private static VariablesToDuplicate variablesToDuplicate;
    private static ClassManipulator classManipulator;

    public static void main(String[] args) {
        validateArguments(args);
        setUpClasses(args);

        classManipulator.copyOldVariables();
        classManipulator.insertPostConditions();
        classManipulator.insertPreCondition();
        
        saveFile();
    }

    private static void setUpClasses(String[] args) {
        setSubjectClass(args);
        setNameGenerator();
        setSpecification(args);
        setVariablesToDuplicate();
        setStatementDuplicationChecker();
        setClassManipulator();
    }

    private static void validateArguments(String cmdArgs[]) {
        if (cmdArgs.length < minArgs)
            throw new IllegalArgumentException("Insufficient arguments provided, expected at least " + minArgs + ", but received " + cmdArgs.length + "\n");
    }
    
    private static void setSubjectClass(String[] cmdArgs) {
        subjectClass = new SubjectClass(cmdArgs[0], cmdArgs[1], cmdArgs[2]);
    }

    private static void setNameGenerator() {
        NameGenerator.SetSubjectClass(subjectClass);
    }

    private static void setSpecification(String cmdArgs[]) {
        spec = new Specification(cmdArgs[3], cmdArgs[4]);
    }

    private static void setVariablesToDuplicate() {
        variablesToDuplicate = new VariablesToDuplicate(spec);
    }

    private static void setStatementDuplicationChecker() {
        StatementDuplicationChecker.setVariablesToDuplicate(variablesToDuplicate);
    }

    private static void setClassManipulator() {
        classManipulator = new ClassManipulator(subjectClass, variablesToDuplicate, spec);
    }

    private static void saveFile() {
        CompilationUnit cu = subjectClass.getCompilationUnit();
        cu.getStorage().get().save();
    }
}
