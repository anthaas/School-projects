package haas.zp3jv.s06;

import java.util.Map;
import java.util.Stack;

/**
 * Created by AntoninHaas.
 */
public class RPNCalc {
    public static double rpnCalc(String expr) {
        return rpnCalc(expr, null);
    }

    public static double rpnCalc(String expr, Map<String, Integer> variables) {
        Stack<Double> stack = new Stack<>();
        String[] exprArr = expr.split(" ");
        for (String atom : exprArr) {
            if (isOperator(atom)) {
                switch (atom) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        double b = stack.pop();
                        double a = stack.pop();
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        double bb = stack.pop();
                        double aa = stack.pop();
                        if (bb == 0) {
                            stack.push(Double.NaN);
                        } else {
                            stack.push(aa / bb);
                        }
                        break;
                }
            } else if (isNumber(atom)){
                stack.push(Double.valueOf(atom));
            } else {
                Integer substitution = variables.get(atom);
                if (substitution == null) {
                    stack.push(Double.NaN);
                } else {
                    stack.push(Double.valueOf(variables.get(atom)));
                }
            }
        }
        return stack.pop();
    }

    private static boolean isNumber(String str) {
        return str.matches("[0-9]+");
    }

    private static boolean isOperator(String str) {
        return (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"));
    }
}
