package lc.stack.m;

import java.util.Stack;

public class DecodeString {
    // O(n) O(n)
    public String decodeString(String s) {
        Stack<Integer>stack=new Stack<>();
        Stack<StringBuilder>stackOfStrs=new Stack<>();
        StringBuilder str = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(c>='0' && c<='9')
                num = num * 10 + c -'0';
            else if(c=='['){
                stackOfStrs.push(str);
                str=new StringBuilder();
                stack.push(num);
                num = 0;
            } else if(c==']'){
                StringBuilder temp=str;
                str=stackOfStrs.pop();
                int count=stack.pop();
                while(count-- > 0){
                    str.append(temp);
                }
            } else
                str.append(c);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        String s = "3[a]2[bc]";
        System.out.println(ds.decodeString(s));
    }
}
