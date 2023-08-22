package lc.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWords {

    private static final String WHITESPACE = " ";

    public static String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();
        for (String word: words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITESPACE);
        }
        return reversedString.toString();
    }

    private static final Pattern PATTERN = Pattern.compile(" +");

    public static String reverseWordsFunc(String str) {
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String str = "Sportco";
        System.out.println(reverseWords(str));
        System.out.println(reverseWordsFunc(str));
    }
}
