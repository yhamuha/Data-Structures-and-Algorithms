package lc.slidingwindow.m;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    // O(n) O(n) #walmart
    /*static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left += 1;
                }
                set.remove(s.charAt(left));
                left += 1;
                set.add(s.charAt(right));
            }
        }
        return maxLength;
    }*/
    // Time:O(n) Space:O(1)best,O(n)worst
    static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            seen.put(ch, seen.getOrDefault(ch, 0) + 1);
            while (seen.get(ch) > 1) {
                char startChar = s.charAt(start);
                seen.put(startChar, seen.get(startChar) - 1);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(new String("abcabcbb")));
    }
}
