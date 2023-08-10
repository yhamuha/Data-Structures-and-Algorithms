package lc.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Delimiter {
    public static String joinByDelimiter(char delimiter, String...args) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (i = 0; i < args.length - 1; i++) {
            result.append(args[i]).append(delimiter);
        }
        result.append(args[i]);
        return result.toString();
    }

    public static String joinByDelimiter_func(char delimiter, String...args) {
        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }

    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";
        char delim = '*';
        System.out.println(joinByDelimiter(delim,str1,str2));

        System.out.println(joinByDelimiter_func(delim, str1, str2));
    }
}
