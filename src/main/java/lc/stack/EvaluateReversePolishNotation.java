package lc.stack;

import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
        /*  infix notation      5+3
            polish notation     53+
            For example, the infix expression (3 × 4) + (5 × 6) becomes 3 4 × 5 6 × + in reverse Polish notation
                advantage - it removes the need of order operations and parentheses that required for infix notation */
        // O(n) O(n)
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            Set<String> ops = Set.of("+", "-", "*", "/");
            for (String s : tokens) {
                if (ops.contains(s)) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int c = 0;
                    switch(s) {
                        case "+" -> {c = b + a;}
                        case "-" -> {c = b - a;}
                        case "*" -> {c = b * a;}
                        case "/" -> {c = b / a;}
                    }
                    stack.push(c);
                }
                else stack.push(Integer.parseInt(s));
            }
            return stack.peek();
        }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        EvaluateReversePolishNotation erpn = new EvaluateReversePolishNotation();
        System.out.println(erpn.evalRPN(tokens));
    }
}


