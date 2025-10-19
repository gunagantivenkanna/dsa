package stack.problems;


import java.util.Map;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] strings = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int result = evaluateExpression(strings);
        System.out.println(result);
    }

    private static int evaluateExpression(String[] strings) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < strings.length; i++) {
            if (isInteger(strings[i])) {
                stack.push(Integer.parseInt(strings[i]));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (strings[i]) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }

            }
        }
        return stack.peek();
    }

    private static boolean isInteger(String s) {
        try {
            Integer
                    .parseInt(s);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}
