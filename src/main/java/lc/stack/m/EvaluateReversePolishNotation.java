package lc.stack.m;

import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
        // O(n) O(n)
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            Set<String> operations = Set.of("+", "-", "*", "/");
            for (String s : tokens) {
                if (operations.contains(s)) {
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


