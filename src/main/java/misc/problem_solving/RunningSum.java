package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(getRunningSum(arr)));
    }

    // o(n), O(1)
    static int[] getRunningSum (int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1] = arr[i] + arr[i+1];
            System.out.println(arr[i]);
        }
        return arr;
    }
}
