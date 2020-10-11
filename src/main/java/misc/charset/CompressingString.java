package misc.charset;

/**
 *  The {@code CompressingString} class
 *  which compress the String
 */
public class CompressingString {

    /**
     * driver method
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(compress("aabbbccc"));
    }

    /**
     * compress the String using StringBuilder
     * @param str           input uncompressed string
     * @return String       compressed string
     */
    static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int sameLettersCount = 0;
        for (int i = 0; i < str.length(); i++) {
            sameLettersCount++;
            char currentLetter = str.charAt(i);
            boolean isLastLetter = (i + 1 == str.length());
            if (isLastLetter || currentLetter != str.charAt(i + 1)) {
                compressed.append(currentLetter);
                compressed.append(sameLettersCount);
                sameLettersCount = 0;
            }
        }
        return compressed.length() < str.length()
                ? compressed.toString()
                : str;
    }
}
