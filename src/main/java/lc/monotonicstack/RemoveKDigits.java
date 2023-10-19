package lc.monotonicstack;

import java.util.Stack;

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
            while(!st.isEmpty() && k-- > 0) {
                st.pop();
            }
            if(st.isEmpty()) return "0";
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
