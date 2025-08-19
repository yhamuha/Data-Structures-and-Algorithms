package lc.stack.m;

import java.util.Stack;

public class BasicCalculatorII {
    // O(n) O(n) #meta
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            if (isOperator(c) || i == s.length() - 1) {
                if (operator == '+') stack.push(num);
                else if (operator == '-') stack.push(-num);
                else if (operator == '*') stack.push(stack.pop() * num);
                else if (operator == '/') stack.push(stack.pop() / num);
                num = 0;
                operator = c;
            }
        }
        int ans = 0;
        while (!stack.isEmpty())
            ans += stack.pop();
        return ans;
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static void main(String[] args) {
        BasicCalculatorII calculator = new BasicCalculatorII();
        String expression = "3+2*2";
        int result = calculator.calculate(expression);
        System.out.println(result);
    }
}
