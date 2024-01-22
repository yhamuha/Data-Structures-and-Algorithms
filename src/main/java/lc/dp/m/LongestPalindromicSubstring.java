package lc.dp.m;

public class LongestPalindromicSubstring {
    int resultStart;
    int resultLength;
    // O(n^2) O(1)
    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }
        // O(n)
        for (int start = 0; start < strLength - 1; start++) {
            // O(n)
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        var lps = new LongestPalindromicSubstring();
        String s = "babad";
        System.out.println(lps.longestPalindrome(s));
    }
}
