package misc.computerVision;

import java.util.HashSet;

/**
 *
 */
public class Main {

    static String getAnyWord(int candidateStart, String str, HashSet<String> words) {
        for (String word : words) {
            int candidateEnd = candidateStart + word.length() - 1;

            if (str.charAt(candidateStart) == word.charAt(0) && candidateEnd < str.length()) {
                String candidate = str.substring(candidateStart, candidateEnd + 1);
                if (word.equals(candidate)) return candidate;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MaxSum ms = new MaxSum(0,0,0);
        SubMatrix sm = new SubMatrix(0,0,0,0,0);
//        int[] arr = {2,3,4,5,-90,7};
//        System.out.println(ms.getMaxSumRange(arr).toString());

//        int[][] arr_2d = {{1,2,-3},{4,-5,6},{7,8,9}};
//        System.out.println(sm.getMaxSumMatrix(arr_2d).toString());

        String str = "khkjkjhbkjhbkjhblike";
        HashSet words = new HashSet();
        words.add("like");

        System.out.println(getAnyWord(16, str, words));
    }
}
