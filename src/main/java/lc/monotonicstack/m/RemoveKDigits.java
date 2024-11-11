package lc.monotonicstack.m;

import java.util.Stack;

public class RemoveKDigits {
        // O(n) O(n)
        public String removeKdigits(String num, int k) {
            Stack<Character> stack = new Stack<>();
            for(Character ch : num.toCharArray()) {
                while(!stack.isEmpty() && k > 0 && ch < stack.peek()) {
                    stack.pop();
                    k--;
                }
                if(!stack.isEmpty() || ch != '0')
                    stack.push(ch);
            }
            while(!stack.isEmpty() && k-- > 0)
                stack.pop();
            if(stack.isEmpty()) return "0";
            String ans = "";
            while(!stack.isEmpty()) {
                ans = stack.pop() + ans;
            }
            return ans;
        }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        RemoveKDigits rkd = new RemoveKDigits();
        System.out.println(rkd.removeKdigits(num,k));
    }
}
