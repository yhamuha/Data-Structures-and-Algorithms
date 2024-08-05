package lc.slidingwindow.m;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    // O(n) O(1)
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            sMap.merge(c, 1, Integer::sum);
        }
        Map<Character, Integer> window = new HashMap<>();
        for (int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            window.merge(c, 1, Integer::sum);
            if (right >= s1.length()) {
                c = s2.charAt(right - s1.length());
                if (window.get(c) == 1)
                    window.remove(c);
                else
                    window.merge(c, -1, Integer::sum);
            }
            if (window.equals(sMap))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        var ps = new PermutationInString();
        System.out.println(ps.checkInclusion(new String("ab"), new String("eidbaooo")));
    }
}
