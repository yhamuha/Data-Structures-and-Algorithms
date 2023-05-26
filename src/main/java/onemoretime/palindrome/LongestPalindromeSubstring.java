package onemoretime.palindrome;

/**
 *  The {@code LongestPalindromeSubstring} class
 *  for finding a longest palindrome substring (LPS)
 *  from a given String.
 *  Time complexity: O(n^2)
 *  Auxiliary Space: O(n^2)
 */
public class LongestPalindromeSubstring {

    /**
     * print substring
     * @param str String  - input string
     * @param low int  - start position
     * @param high int  - end position
     * @return void
     */
    static void printSubStr(
            String str, int low, int high)
    {
        System.out.println(
                str.substring(
                        low, high + 1));
    }

    /**
     * print longest palindrome
     * @param str String  - input string
     * @return maxLength int - palindrome length
     */
    static int longestPalSubstr(String str)
    {
        int n = str.length();

        boolean table[][] = new boolean[n][n];

        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; ++k) {

            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;

                if (table[i + 1][j - 1]
                        && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome: ");
        printSubStr(str, start,
                start + maxLength - 1);

        return maxLength;
    }

    /**
     * method main to test above functions
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args)
    {
        String str = "thisissisiht";
        System.out.println("Length is: " + longestPalSubstr(str));
    }
}

