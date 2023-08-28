package lc.strings;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicate {

    public static String removeDuplicates(String str) {
        char[] chArray = str.toCharArray(); // or, use charAt(i)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) { // negative means that StringBuilder
                                                        // doesn't contain the current character
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String removeDuplicates_hs(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();
        for (char c: chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = new String("abba");
        System.out.println(removeDuplicates_hs(str));
    }
}
