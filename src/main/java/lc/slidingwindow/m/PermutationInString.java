package lc.slidingwindow.m;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public boolean checkInclusion(String s, String p) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // TC avg O(1), worst O(n)
            sMap.merge(c, 1, Integer::sum);
        }
        Map<Character, Integer> window = new HashMap<>();
        for (int right = 0; right < p.length(); right++) {
            char c = p.charAt(right);
            // Increment the characters in the window
            window.merge(c, 1, Integer::sum);
            if (right >= s.length()) {
                // right - s.length() will give us the position of the left pointer
                c = p.charAt(right - s.length());
                if (window.get(c) == 1) {
                    window.remove(c);
                } else {
                    // Decrement the character in the window
                    window.merge(c, -1, Integer::sum);
                }
            }
            // checking on each iteration if windows map conatins elements of s
            if (window.equals(sMap)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var ps = new PermutationInString();
        System.out.println(ps.checkInclusion(new String("ab"), new String("eidbaooo")));
    }
}
