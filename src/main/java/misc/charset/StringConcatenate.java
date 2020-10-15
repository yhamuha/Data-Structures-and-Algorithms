package misc.charset;

/** Class {@code StringConcatenate}
 * ensure concatenate two strings
 *
 */
public class StringConcatenate {
    /**
     *
     * @param args the command line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(concatenate("ac", "bd"));
    }

    /**
     * Complexity O(A+B)
     *
     * @param s1    first string
     * @param s2    second string
     * @return      concatenated new string
     */
    static String concatenate(String s1, String s2) {

        int resultStrLength = s1.length() + s2.length();

        char[] resultStr = new char[resultStrLength];

        for (int i = 0; i < s1.length(); i++)
            resultStr[i] = s1.charAt(i);

        for (int i = s1.length(); i < resultStrLength; i++)
            resultStr[i] = s2.charAt(i - s1.length());

        return new String(resultStr);
    }
}
