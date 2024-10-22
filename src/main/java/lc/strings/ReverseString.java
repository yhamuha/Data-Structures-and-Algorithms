package lc.strings;

import java.util.Arrays;

public class ReverseString {
    // O(n) O(1)
    public static void reverseString(char[] s) {
        int len = s.length;
        int left = 0;
        int right = s.length - 1;
        while(left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'H', 'e', 'l', 'l', 'o'};
        reverseString(str);
        System.out.println(Arrays.toString(str));
    }
}
