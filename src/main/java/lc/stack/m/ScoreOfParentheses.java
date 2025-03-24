package lc.stack.m;

import java.util.Stack;

public class ScoreOfParentheses {
    // O(n) O(n)
    public int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            if(ch == '(')
                stack.push(ch);
            else {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    stack.push('1');
                } else {
                    int sum = 0;
                    while(!stack.isEmpty() && stack.peek()!='(')
                        sum += stack.pop()-'0';
                    stack.pop();
                    stack.push((char)(2*sum+'0'));
                }
            }
        }

        int sum = 0;
        while(!stack.isEmpty())
            sum += (stack.pop()-'0');
        return sum;
    }

    public static void main(String[] args) {
        ScoreOfParentheses scoreCalc = new ScoreOfParentheses();
        String s = "(())";
        System.out.println(scoreCalc.scoreOfParentheses(s));
    }
}
