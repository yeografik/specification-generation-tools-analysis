import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithStatements;
import com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt;
import com.github.javaparser.ast.nodeTypes.NodeWithBody;
import com.github.javaparser.ast.NodeList;
import java.util.Optional;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Inserts given assertion before return statement in the given method
 * arg 0: path to java class
 * arg 1: class name
 * arg 2: method name
 * arg 3: precondition to insert
 * arg 4: postcondition to insert
 */
public class AssertionInserter {

    private static final int minArgs = 5;
    private static int postCondIndex = 0;
    private static Set<String> usedVarNames = new HashSet<>();
    private static Set<String> oldVars;
    private static Map<String, String> newVarsMap = new HashMap<>();

    public static void main(String args[]) {
        if (args.length < minArgs)
            throw new IllegalArgumentException("Insufficient arguments provided, expected at least " + minArgs + ", but received " + args.length + "\n");

        CompilationUnit cu;
        try {
          cu = StaticJavaParser.parse(new File(args[0])); //JavaFile.java
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File " + args[0] + " doesn't exists");
        }
        Optional<ClassOrInterfaceDeclaration> subjectClass = cu.getClassByName(args[1]);
        if (!subjectClass.isPresent()) 
            throw new IllegalArgumentException("Class " + args[1] + " doesn't exists\n");
        List<MethodDeclaration> methodList = subjectClass.get().getMethodsByName(args[2]);
        if (methodList.isEmpty()) 
            throw new IllegalArgumentException("Method " + args[2] + " doesn't exists\n");
        
        getUsedVarNames(cu, methodList);

        BlockStmt body = methodList.get(0).getBody().get();
        insertAssertion(body.getStatements(), 0, args[3]); //add precondition at beginning
        
        oldVars = getOldVariables(args);
        String[] postConds = postConditionsAsArray(args);
        insertPostConditions(body.getStatements(), postConds, methodList.get(0).getParameters()); //insert postconditions before each return

        cu.getStorage().get().save();   //save file
    }

    private static void insertAssertion(NodeList<Statement> body, int pos, String condition) {
        if (condition.isEmpty()) 
            condition = "true";
        insert(body, pos, "assert (" + condition + ");");
    }
    
    private static void insert(NodeList<Statement> body, int pos, String statement) {
        Statement stmt = StaticJavaParser.parseStatement(statement);
        body.add(pos, stmt);
    }

    private static String[] postConditionsAsArray(String[] args) {
        int len = args.length - 4;
        String[] conds = new String[len];
        for (int i = 0; i < len; i++)
            conds[i] = args[i + 4];
            
        return conds;
    }
    
    private static void insertPostConditions(NodeList<Statement> body, String[] postConds, NodeList<Parameter> parameters) {
        for (Parameter p : parameters)
            if (oldVars.contains(p.getNameAsString()))
                addParameterDuplication(p, body);

        traverseStatements(body, postConds);
    }

    private static int addParameterDuplication(Parameter param, NodeList<Statement> body) {
        String paramName = param.getNameAsString();
        oldVars.remove(paramName);
        String newName = getNewVarName(paramName);
        insert(body, 0, param.getTypeAsString() + " " + newName + " = " + param.getNameAsString() + ";");
        newVarsMap.put("\\old(" + paramName + ")", newName);
        
        return 1;
    }

    private static String getNewVarName(String origVar) {
        String baseName = "old_" + origVar;
        String finalName = baseName;
        int num = 1;
        do {
            finalName = baseName + "_" + num;
            num++;
        } while (usedVarNames.contains(finalName));

        return finalName;
    }

    private static void traverseStatements(NodeList<Statement> body, String[] postConds) {
        int pos = 0;
        List<Integer> insertionPositions = new LinkedList<>();
        for (Statement s : body) {
            if (isVarAssignment(s) && isOldVarFirstValue(s.asExpressionStmt())) 
                insertionPositions.add(pos); //add new var with old value of var
            else if (s.isReturnStmt()) //add postconditions before return
                insertionPositions.add(pos);
            else
                checkComplexStatement(s, postConds);
            pos++;
        }
        
        //insert post conditions in all the returns found in body
        int insertions = 0;
        for (Integer i : insertionPositions) {
            Statement stmt = body.get(i + insertions);
            if (stmt.isReturnStmt())
                insertions += addAssertBeforeReturn(postConds, stmt.asReturnStmt(), body, i, insertions);
            else if (stmt.isExpressionStmt())
                insertions += addVariableDuplication(stmt.asExpressionStmt(), body, i, insertions);
            else 
                throw new IllegalStateException("Invalid statement in insertion list: " + stmt);
        }
    }

    private static boolean isVarAssignment(Statement s) {
        if (!s.isExpressionStmt())
            return false;

        Expression expr = s.asExpressionStmt().getExpression();
        return expr.isVariableDeclarationExpr() || expr.isAssignExpr(); 
    }
    
    private static boolean isOldVarFirstValue(ExpressionStmt s) {
        Expression expr = s.getExpression();
        if (expr.isAssignExpr() && oldVars.contains(expr.asAssignExpr().getTarget().toString())) {
            return true;
        } else if (expr.isVariableDeclarationExpr()) {
            VariableDeclarationExpr varDeclExpr = expr.asVariableDeclarationExpr();
            for (VariableDeclarator var : varDeclExpr.getVariables())
                if (var.getInitializer().isPresent() && oldVars.contains(var.getNameAsString()))
                    return true;
        }
        
        return false;
    }

    private static int addAssertBeforeReturn(String[] postConds, ReturnStmt returnStmt, NodeList<Statement> body, int i, int offset) {
        postConds[postCondIndex] = formatNonJavaTerms(postConds[postCondIndex], returnStmt);
        insertAssertion(body, i + offset, postConds[postCondIndex]);
        postCondIndex++;
        
        return 1;
    }

    private static int addVariableDuplication(ExpressionStmt exprStmt, NodeList<Statement> body, int i, int offset) {
        int insertions = 0;
        Expression expr = exprStmt.getExpression();
        if (expr.isAssignExpr() && oldVars.contains(expr.asAssignExpr().getTarget().toString())) {
            String oldVar = expr.asAssignExpr().getTarget().toString();
            String newName = getNewVarName(oldVar);
            insert(body, i + offset + 1, newName + " = " + expr.asAssignExpr().getValue() + ";");
            insertions++;
            oldVars.remove(oldVar);
            newVarsMap.put("\\old(" + oldVar + ")", newName);

        } else if (expr.isVariableDeclarationExpr()) {
            VariableDeclarationExpr varDeclExpr = expr.asVariableDeclarationExpr();
            for (VariableDeclarator var : varDeclExpr.getVariables()) {
                String varName = var.getNameAsString();
                if (oldVars.contains(varName) && var.getInitializer().isPresent()) {
                    String newName = getNewVarName(varName);
                    insert(body, i + offset + 1, newName + " = " + var.getInitializer() + ";");
                    insertions++;
                    oldVars.remove(varName);
                    newVarsMap.put("\\old(" + varName + ")", newName);
                }
            }
        } else {
            throw new IllegalArgumentException("Given expression is not a valid type: " + expr.getClass());
        }

        return insertions;
    }
    
    private static void checkComplexStatement(Statement s, String[] postConds) {
        if (s instanceof NodeWithStatements<?>)
            traverseStatements(((NodeWithStatements<?>)s).getStatements(), postConds);
        else if (s instanceof NodeWithBody<?>)
            checkComplexStatement(((NodeWithBody<?>)s).getBody(), postConds);
        else if (s.isIfStmt())
            searchIfStmt(s.asIfStmt(), postConds);
        else if (s instanceof NodeWithBlockStmt<?>)
            traverseStatements(((NodeWithBlockStmt<?>)s).getBody().getStatements(), postConds);
        else if (s.isTryStmt())
            traverseStatements(s.asTryStmt().getTryBlock().getStatements(), postConds);
    }

    private static void searchIfStmt(IfStmt s, String[] postConds) {
        if(s.hasThenBlock())
            checkComplexStatement(s.getThenStmt(), postConds);
        
        Optional<Statement> elseStmt = s.getElseStmt();
        if(elseStmt.isPresent())
            checkComplexStatement(elseStmt.get(), postConds);
    }
    
    private static String formatNonJavaTerms(String spec, Statement returnStmt) {
        if (!returnStmt.isReturnStmt())
            throw new IllegalArgumentException("Not a return statement, received " + returnStmt);
        
        ReturnStmt retStmt = returnStmt.asReturnStmt();
        String returnBody = retStmt.getExpression().get().toString();
        spec = spec.replace("\\result", returnBody);
        
        for (Map.Entry<String, String> set : newVarsMap.entrySet())
            spec = spec.replace(set.getKey(), set.getValue());
        
        return spec;
    }

    private static void getUsedVarNames(CompilationUnit cu, List<MethodDeclaration> methodList) {
        //class attributes
        for (FieldDeclaration field : cu.findAll(FieldDeclaration.class))
            for (VariableDeclarator variable : field.getVariables())
                usedVarNames.add(variable.getNameAsString());
        
        MethodDeclaration method = methodList.get(0);
        //method parameters
        for (Parameter p : method.getParameters())
            usedVarNames.add(p.getNameAsString());
        
        //method variables
        for (VariableDeclarationExpr varDecl : method.findAll(VariableDeclarationExpr.class)) {
            for (VariableDeclarator var : varDecl.getVariables()) {
                usedVarNames.add(var.getNameAsString());
            }
        }
    }

    private static Set<String> getOldVariables(String[] args) {
        Set<String> variables = new HashSet<>();
        String specs="";
        for (int i = 3; i < args.length; i++)
            specs+= args[i];

        Matcher m = Pattern.compile("\\\\old\\([a-z_$][a-zA-Z_$0-9]*\\)").matcher(specs);
        while(m.find()) {
            String found = m.group();
            variables.add(found.replace("\\old(", "").replace(")", "")); //add var name
        }

        return variables;
    }
}