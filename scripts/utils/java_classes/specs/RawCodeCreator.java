package java_classes.specs;

import com.github.javaparser.ast.type.Type;

public class RawCodeCreator {
    
    public static String createReturnStatement(Type methodReturnType) {
        if (methodReturnType.isVoidType()) 
            return voidReturn();
        else if (!methodReturnType.isPrimitiveType()) 
            return nullReturn();
        else
            return defaultValueReturn(methodReturnType);
    }

    public static String createIfStatement(String condition) {
        return "if (!(" + condition + ")) {";
    }

    public static String createAssertStatement(String condition) {
        if (condition.isEmpty()) 
            condition = "true";
        return "assert (" + condition + ");";
    }

    public static String createDeclaration(String type, String newName, String value) {
        return type + " " + newName + " = " + value + ";";
    }

    public static String createAssingment(String name, String value) {
        return name + " = " + value + ";";
    }

    public static String createFunctionCall(String functionInvocation, String argument) {
        return functionInvocation + "(" + argument + ")";
    }

    private static String voidReturn() {
        return "return;}";
    }

    private static String nullReturn() {
        return "return null;}";
    }

    private static String defaultValueReturn(Type ReturnType) {
        return "return " + getDefaultValue(ReturnType) + ";}";
    }

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