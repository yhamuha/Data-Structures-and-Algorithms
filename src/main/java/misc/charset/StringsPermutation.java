package misc.charset;

import java.util.Arrays;

public class StringsPermutation {

    public static void main(String[] args) {
        System.out.println(permutation("free", "eefr"));
    }

    static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    static boolean permutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return sort(s1).equals(sort(s2));
    }
}
