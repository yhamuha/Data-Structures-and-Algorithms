package misc.a__xTraining.stringDemo;

import java.util.Arrays;

/**
 *
 */
//public class SwapString {
//    public static void main(String[] args) {
//        String str = "abc";
//        System.out.println(swap(str,1,2));
//    }
//
//    static char[] swap (String str, int i, int j) {
//        char ch[] = str.toCharArray();
//        char temp = ch[i];
//        ch[i] = ch[j];
//        ch[j] = temp;
//        return ch;
//    }
//}

class Demo {
    public static void main(String[] argv) {
        String str = "ab";
        System.out.println(Arrays.toString(swap(str,0,1)));
    }


//    static char[] swap(String str, int i, int j) {
//        char[] ch = str.toCharArray();
//        char temp = ch[i];
//        ch[i] = ch[j];
//        ch[j] = temp;
//        return ch;
//    }\\

    static char[] swap (String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}