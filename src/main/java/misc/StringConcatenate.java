package misc;

/**
 *  The {@code StringConcatenate} class represents a String concatenates.
 *
 *  It includes methods for concatenate two Strings.
 *
 */
public class StringConcatenate {
    /**
     * Unit tests the strings concatenation.
     *
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        String str1 = new String("s1");
        String str2 = new String("s2");
        String s3 = concatenate(str1,str2);
        System.out.println(s3);
    }
    /**
     * Return a string representation of concatenation.
     * @return a string
     *         concatenation("s1","s2") -> "s1s2"
     */
    static String concatenate (String s1, String s2) {
        int resultStrLength = s1.length() + s2.length();
        char[] resultStr = new char[resultStrLength];

        for (int i=0; i<s1.length(); i++) {
            resultStr[i] = s1.charAt(i);
        }

        for (int i=s1.length(); i<resultStrLength; i++) {
            resultStr[i] = s2.charAt(i-s1.length());
        }

        return new String(resultStr);
    }
}
