package misc.problem_solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    static int[] sortArrayByParityII(int[] nums) {
        int even=0, odd=1;
        while (even<nums.length && odd<nums.length){
            if (nums[even]%2==0)
                even+=2;
            else if (nums[odd]%2!=0)
                odd+=2;
            else {
                int t = nums[even];
                nums[even] = nums[odd];
                nums[odd] = t;
            }
        }
        return nums;
    }




}
