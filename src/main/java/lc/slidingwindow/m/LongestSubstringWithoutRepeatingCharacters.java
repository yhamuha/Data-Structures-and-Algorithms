package lc.slidingwindow.m;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    // O(n) O(n)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right=0; right< s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            } else {
                while (s.charAt(left) != s.charAt(right)) { // just remove
                    set.remove(s.charAt(left));
                    left+=1;
                }
                set.remove(s.charAt(left)); left+=1;        // remove and add
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        var ls = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(ls.lengthOfLongestSubstring(new String("pwwkew")));
    }
}
