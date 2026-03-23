package lc.dp.m;

public class LongestPalindromicSubstring {
    // O(n) O(1)
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLen = 1;
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (len <= 2)
                        dp[i][j] = true;
                     else
                        dp[i][j] = dp[i + 1][j - 1];
                }
                if (dp[i][j] && len > maxLen) {
                    start = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        var lps = new LongestPalindromicSubstring();
        String s = "babad";
        System.out.println(lps.longestPalindrome(s));
    }
}
