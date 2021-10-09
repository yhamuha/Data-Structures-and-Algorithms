package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class RandomizeByRange {
    public static void main(String[] args) {
        int size = 5;
        int i_from = 1;
        int i_to = 10;
        System.out.println(Arrays.toString(randomizeByRange(size, i_from, i_to)));
        int[] array = {2,5,11,16};
        System.out.println(maxArray(array));
    }

    static int[] randomizeByRange (int size, int i_from, int i_to){
        int[] a;
        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * (Math.abs(i_from - i_to) + 1)) + Math.min(i_from, i_to));
        }
        return a;
    }

    // max array

    public static int maxArray (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
