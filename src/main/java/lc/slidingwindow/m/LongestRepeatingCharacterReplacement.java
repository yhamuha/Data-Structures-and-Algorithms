package lc.slidingwindow.m;

public class LongestRepeatingCharacterReplacement {
    // O(n) O(26)
    public int characterReplacement(String s, int k) {
        // Space O(26)
        int[] dic = new int[26];
        int start = 0;
        int maxLen = 0;
        // Time O(n)
        for (int end = 0; end < s.length(); end++) {
            maxLen = Math.max(maxLen, ++dic[s.charAt(end) - 'A']);
            // comparison (end - start + 1 > maxLen + k) needs to determine that
            // the window with (maxLength of unique element + k (quantity of character changes))
            // should be exact size
            // if not: decrease char quantity and move pointer
            if (end - start + 1 > maxLen + k) {
                dic[s.charAt(start) - 'A']--;
                start++;
            }
        }
        return s.length() - start;
    }

    public static void main(String[] args) {
        var lrc = new LongestRepeatingCharacterReplacement();
        System.out.println(lrc.characterReplacement(new String("AABABBA"),1));
    }
}
