package lc.slidingwindow.m;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    // O(n) O(1)
    /*static int characterReplacement(String s, int k) {
        int[] letters = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++) {
            letters[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, letters[s.charAt(right) - 'A']);
            if (right - left + 1 - maxCount > k) {
                letters[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }*/

    // O(n) O(n)
    static int characterReplacement(String s, int k) {
        Map<Character, Integer> charCount = new HashMap<>();
        int maxFreq = 0;
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, charCount.get(ch));
            while ((end - start + 1) - maxFreq > k) {
                char leftChar = s.charAt(start);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
