package lc.arrays;

import java.util.Arrays;

public class TwoSum {

    static public int[] findTwoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
            int num1 = nums[i];
            for(int j = i + 1; j < nums.length; j++)
            {
                int num2 = nums[j];
                int sum = num1 + num2;
                if(sum == target)
                {
                    return new int[] {i , j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,5,6,7};
        System.out.println(Arrays.toString(findTwoSum(arr, 3)));
    }
}
