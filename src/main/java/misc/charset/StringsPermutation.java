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

    boolean permutationTimes(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] letters = new int[128];
        for (char letter : s1.toCharArray()) {
            int letterCode = (int) letter;
            letters[letterCode]++;
        }
        for (char letter : s2.toCharArray()) {
            int letterCode = (int) letter;
            letters[letterCode]--;
            if (letters[letterCode] != -1) return false;
        }
        return true;
    }
}
