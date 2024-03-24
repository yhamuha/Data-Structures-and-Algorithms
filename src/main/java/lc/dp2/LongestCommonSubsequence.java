package lc.dp2;

public class LongestCommonSubsequence {
    // O(m*n) O(m*n)
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        return lcsBU(s1, s2);
    }
    public static int lcsBU(char[] s1, char[] s2) {
        int[][] dp = new int[s1.length + 1][s2.length + 1];
        for (int i = 1; i <= s1.length; i++) {
            for (int j = 1; j <= s2.length; j++) {
                int ans = 0;
                if (s1[i - 1] == s2[j - 1]) {
                    ans = 1 + dp[i - 1][j - 1];
                } else {
                    int a = dp[i - 1][j];
                    int b = dp[i][j - 1];
                    ans = Math.max(a, b);
                }
                dp[i][j] = ans;
            }
        }
        return dp[s1.length][s2.length];
    }
    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(lcs.longestCommonSubsequence(text1, text2));
    }
}
