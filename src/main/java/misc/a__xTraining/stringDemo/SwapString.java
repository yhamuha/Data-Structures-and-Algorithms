package misc.a__xTraining.stringDemo;

import java.util.Arrays;

/**
 *
 */

class Demo {
    public static void main(String[] argv) {
        String str = "abcd";
        System.out.println(Arrays.toString(swap(str,0,3)));
    }

    static char[] swap (String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}