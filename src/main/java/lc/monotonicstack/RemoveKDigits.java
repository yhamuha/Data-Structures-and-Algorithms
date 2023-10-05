package lc.monotonicstack;

import java.util.Stack;


/*
    mums    1432219
    k       3


 */

public class RemoveKDigits {
        public String removeKdigits(String num, int k) {
            Stack<Character> st = new Stack<>();
            for(Character ch : num.toCharArray()) {
                while(!st.isEmpty() && k > 0 && ch < st.peek()) {
                    st.pop();
                    k--;
                }

                if(!st.isEmpty() || ch != '0') {
                    st.push(ch);
                }
            }

            // This is a special edge case --> 1 2 3 4
            while(!st.isEmpty() && k-- > 0) {
                st.pop();
            }
            if(st.isEmpty()) return "0";

            // Store the ans -->
            String ans = "";
            while(!st.isEmpty()) {
                ans = st.peek() + ans;
                st.pop();
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
