package lc.slidingwindow.m;

public class LongestRepeatingCharacterReplacement {
    // O(n) O(26)
    public int characterReplacement(String s, int k) {
        int[] letters = new int[26];
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            maxLen = Math.max(maxLen, letters[s.charAt(right) - 'A']+=1);
            if (right - left + 1 > maxLen + k) {
                letters[s.charAt(left) - 'A'] -= 1;
                left += 1;
            }
        }
        return s.length() - left;
    }

    public static void main(String[] args) {
        var lrc = new LongestRepeatingCharacterReplacement();
        System.out.println(lrc.characterReplacement(new String("AABBAA"),2));
    }
}
