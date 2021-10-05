package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello my close friend";
        int k = 3;
        System.out.println(truncateSentence(s, k));
    }

    // O(n), O(n^2)
    static String truncateSentence (String s, int k) {

        String[] sArray = s.split(" ");
        String str = "";
        for (int i = 0; i < k; i++) {
            str += sArray[i];
            str += " ";
        }
        return str.trim();
    }

    // O(n), O(n)
    static String truncateSentence2(String s, int k) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    // one liner code
    static String truncateSentence3(String s, int k) {
        return String.join(" ", Arrays.copyOfRange(s.split(" "),0,k));
    }
}
