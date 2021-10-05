package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    // O(n), O(1)
    static String toLowerCase (String s) {

        char[] outputStringAsChar = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            if ((((int)s.charAt(i)) > 65) && (((int)s.charAt(i)) < 90)) {
                outputStringAsChar[i] = (char)(((int)s.charAt(i)) + 32);
            } else {
                outputStringAsChar[i] = (char)((int)s.charAt(i));
            }
        }

        String str = new String(outputStringAsChar);
        return str;
    }
}
