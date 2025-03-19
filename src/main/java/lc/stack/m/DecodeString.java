package lc.stack.m;

import java.util.Stack;

public class DecodeString {
    // O(n) O(n)
    static String decodeString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> stackOfStrings = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(c>='0' && c<='9')
                num = num * 10 + c -'0';
            else if(c=='['){
                stackOfStrings.push(sb);
                sb=new StringBuilder();
                stack.push(num);
                num = 0;
            } else if(c==']'){
                StringBuilder temp=sb;
                sb=stackOfStrings.pop();
                int count=stack.pop();
                while(count-- > 0)
                    sb.append(temp);
            } else
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
