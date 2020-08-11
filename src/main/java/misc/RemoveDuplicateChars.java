package misc;

import java.util.Arrays;

class RemoveDuplicateChars {

    static char[] removeDuplicates(String string)
    {

        int counter = 0;
        char[] str = string.toCharArray();
        int i = 0;
        int size = str.length;

        int x;

        int length = 0;

        while (i < size) {
            x = str[i] - 97;

            if ((counter & (1 << x)) == 0) {

                str[length] = (char)('a' + x);

                counter = counter | (1 << x);

                length++;
            }
            i++;
        }

        return Arrays.copyOfRange(str, 0, length);
    }

    public static void main(String[] args)
    {
        String str = "duplicate chars";
        System.out.println(removeDuplicates(str));
    }
}
