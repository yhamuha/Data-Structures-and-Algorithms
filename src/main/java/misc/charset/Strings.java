package misc.charset;

public class Strings {

    public static void main(String[] args) {
        System.out.println(concatenate("a","b"));
    }

    static String concatenate(String s1, String s2) {
        int resultStrLength = s1.length() + s2.length();
        char[] resultStr = new char[resultStrLength];
        for (int i = 0; i < s1.length(); i++)
            resultStr[i] = s1.charAt(i);
        for (int i = s1.length(); i < resultStrLength; i++)
            resultStr[i] = s2.charAt(i - s1.length());
        return new String(resultStr);
    }

    static String substring(String str, int start, int end) {
        int subStrLength = end - start;
        char[] subStr = new char[subStrLength];
        for (int i = start; i < end; i++)
            subStr[i - start] = str.charAt(i);
        return new String(subStr);
    }

    String joinWords(String[] words) {
        String sentence = "";
        for (String w: words)
            sentence = sentence + w;
        return sentence;
    }

    // for ASCII 32->127
    boolean isUniqueChars(String str) {
        if (str.length() > 96) return false;
        boolean[] chars = new boolean[96];
        for (int i = 0; i < str.length(); i++) {
            int charCode = str.charAt(i) - 32;
            if (chars[charCode]) return false;
            chars[charCode] = true;
        }
        return true;
    }
}
