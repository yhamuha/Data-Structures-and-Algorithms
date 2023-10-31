package lc.slidingwindow.m;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public boolean checkInclusion(String s, String p) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sMap.merge(c, 1, Integer::sum);
        }
        Map<Character, Integer> window = new HashMap<>();
        for (int r = 0; r < p.length(); r++) {
            char c = p.charAt(r);
            // Increment the characters in the window
            window.merge(c, 1, Integer::sum);
            if (r >= s.length()) {
                // r - s.length() will give us the position of the left pointer
                c = p.charAt(r - s.length());
                if (window.get(c) == 1) {
                    window.remove(c);
                } else {
                    // Decrement the character in the window
                    window.merge(c, -1, Integer::sum);
                }
            }
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
