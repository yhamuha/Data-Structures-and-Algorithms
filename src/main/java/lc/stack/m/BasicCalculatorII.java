package lc.stack.m;

import java.util.Stack;

public class BasicCalculatorII {
    // O(n) O(n)
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            if (isOperator(c) || i == s.length() - 1) {
                if (operator == '+') st.push(num);
                else if (operator == '-') st.push(-num);
                else if (operator == '*') st.push(st.pop() * num);
                else if (operator == '/') st.push(st.pop() / num);
                num = 0;
                operator = c;
            }
        }
        int ans = 0;
        while (!st.isEmpty())
            ans += st.pop();
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
