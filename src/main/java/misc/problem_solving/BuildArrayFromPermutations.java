package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class BuildArrayFromPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int l = nums.length;
        int[] returnArr = new int[l];
        for( int i=0; i<l; i++ ){
            returnArr[i] = nums[nums[i]];
        }
        return returnArr;
    }
}
