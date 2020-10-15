package misc.charset;

/** Class {@code StringsManipulating}
 * included some functions for manipulate string
 *
 */
public class StringManipulating {

    /**
     *
     * @param args the command line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(concatenate("ac", "bd"));
        System.out.println(substring("prescriptions", 8, 10));
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

    /**
     * Substring
     * Complexity O(A-B)
     *
     * @param str       given string
     * @param start     start cut
     * @param end       end cut
     * @return          new substring as string
     */
    static String substring(String str, int start, int end) {
        int subStrLength = end - start;
        char[] subStr = new char[subStrLength];
        for (int i = start; i < end; i++)
            subStr[i - start] = str.charAt(i);
        return new String(subStr);
    }
}
