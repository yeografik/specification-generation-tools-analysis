package java_classes.specs;

import com.github.javaparser.ast.type.Type;

/**
 * A utility class for generating raw code snippets, such as return statements,
 * conditionals, and variable assignments. This class provides static methods
 * for creating code fragments dynamically based on input types and values.
 */
public class RawCodeCreator {

    /**
     * Creates a return statement based on the given method return type.
     *
     * <p>Generates a return statement for void, primitive, or reference types.
     * If the type is void, a simple {@code return;} is created. If the type is
     * non-primitive, a {@code return null;} statement is created. For primitive
     * types, an appropriate default value is returned.
     *
     * @param methodReturnType the return type of the method
     * @return a string representation of the return statement
     * @throws IllegalArgumentException if the type is not handled by the method
     */
    public static String createReturnStatement(Type methodReturnType) {
        if (methodReturnType.isVoidType()) 
            return voidReturn();
        else if (!methodReturnType.isPrimitiveType()) 
            return nullReturn();
        else
            return defaultValueReturn(methodReturnType);
    }

    /**
     * Creates an if statement with the given condition.
     *
     * <p>The condition is wrapped in an if-block formatted as
     * {@code if (!(condition)) { }.
     *
     * @param condition the condition for the if statement
     * @return a string representation of the if statement
     */
    public static String createIfStatement(String condition) {
        return "if (!(" + condition + ")) {";
    }

    /**
     * Creates an assert statement based on the provided condition.
     *
     * <p>If the input condition is empty, the method defaults to
     * {@code assert (true);}.
     *
     * @param condition the condition to be asserted
     * @return a string representation of the assert statement
     */
    public static String createAssertStatement(String condition) {
        if (condition.isEmpty()) 
            condition = "true";
        return "assert (" + condition + ");";
    }

    /**
     * Creates a variable declaration statement with an initial value.
     *
     * <p>The declaration is created as {@code type varName = value;}.
     *
     * @param type the type of the variable as a string
     * @param varName the name of the new variable
     * @param value the initial value assigned to the variable
     * @return a string representation of the variable declaration
     */
    public static String createDeclaration(String type, String varName, String value) {
        return type + " " + varName + " = " + value + ";";
    }

    /**
     * Creates an assignment statement.
     *
     * <p>The assignment is created as {@code varName = value;}.
     *
     * @param name the variable name to assign a value to
     * @param value the value to be assigned
     * @return a string representation of the assignment statement
     */
    public static String createAssignment(String name, String value) {
        return name + " = " + value + ";";
    }

    /**
     * Generates a function call with a single argument.
     *
     * <p>The function call is created as {@code function(argument);}.
     *
     * @param function the function name to be invoked
     * @param argument the argument passed to the function call
     * @return a string representation of the function call
     */
    public static String createFunctionCall(String function, String argument) {
        return function + "(" + argument + ")";
    }

    /**
     * Generates a return statement for void methods.
     *
     * @return a string representation of a void return statement
     */
    private static String voidReturn() {
        return "return;}";
    }

    /**
     * Generates a return statement for reference types, returning null.
     *
     * @return a string representation of a null return statement
     */
    private static String nullReturn() {
        return "return null;}";
    }

    /**
     * Generates a return statement for primitive types with a default value.
     *
     * @param returnType the type of the method
     * @return a string representation of a return statement with a default value
     * @throws IllegalArgumentException if the type is not supported
     */
    private static String defaultValueReturn(Type returnType) {
        return "return " + getDefaultValue(returnType) + ";}";
    }

    /**
     * Determines the default value for a given primitive type.
     *
     * @param type the type of the primitive
     * @return a string representation of the default value for the type
     * @throws IllegalArgumentException if the type is not recognized
     */
    private static String getDefaultValue(Type type) {
        String typeString = type.asString();
        String value;
        switch (typeString) {
            case "int":
                value = "0";
                break;
            case "long":
                value = "0";
                break;
            case "double":
                value = "0.0";
                break;
            case "boolean":
                value = "false";
                break;
            default:
                throw new IllegalArgumentException("Type " + typeString + " is not contemplated");
        }

        return value;
    }
}