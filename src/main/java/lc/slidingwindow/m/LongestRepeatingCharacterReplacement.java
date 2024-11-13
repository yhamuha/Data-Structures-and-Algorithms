package lc.slidingwindow.m;

public class LongestRepeatingCharacterReplacement {

    static int characterReplacement(String s, int k) {
        // O(n) O(1)
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
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
    }
}
