package lc.greedy.m;

public class ValidParenthesisString {
    // O(n) O(1)
    public boolean checkValidString(String s)
    {
        int left = 0, right =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(')
                left++;
            else
                left--; // *)

            if (ch !=')')
                right++;
            else
                right--; //

            if (right < 0)
                break;
            left = Math.max(0, left);
        }
        return left == 0;
    }

    public static void main(String[] args) {
        var vps = new ValidParenthesisString();
        String s = "(*))";
        System.out.println(vps.checkValidString(s));
    }
}
