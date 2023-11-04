package lc.slidingwindow.m;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        // SC O(26)
        int[] letters = new int[26];
        int left = 0;
        int maxLength = 0;
        // TC O(n)
        for(int right = 0; right < s.length(); right++) {
            maxLength = Math.max(maxLength, ++letters[s.charAt(right) - 'A']);
            // If the window size (end - start + 1) is greater than the maxLength of unique elements + k,
            // decrease the character quantity and move the pointer.
            if (right - left + 1 > maxLength + k) {
                letters[s.charAt(left)-'A']--;
                left +=1;
            }
        }
        return (s.length() - left);
    }

    public static void main(String[] args) {
        var lrc = new LongestRepeatingCharacterReplacement();
        System.out.println(lrc.characterReplacement(new String("AABABBA"),1));
    }
}
