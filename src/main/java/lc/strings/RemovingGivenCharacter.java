package lc.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemovingGivenCharacter {

    // Pattern.quote using regexp
    public static String removeCharacter(String str, char ch) {
        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");

    }
    // using sb
    public static String removeCharacter_sb(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();
        for (char c : chArray) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // java 8 approach
    //    1. Convert the string into IntStream via the String.chars() method
    //    2. Filter IntStream to eliminate duplicates
    //    3. Map the resulted IntStream to Stream<String>
    //    4. Join the strings from this stream and collect them as a single string
    public static String removeCharacter_func(String str, char ch) {
        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "Kind of music";
        char ch = 'i';
        System.out.println(removeCharacter_sb(str, ch));
        System.out.println(removeCharacter_func(str,ch));
    }
}
