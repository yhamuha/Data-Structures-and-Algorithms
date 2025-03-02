package lc.twopointer.m;

import java.util.Arrays;

public class TwoSum_II_InputArrayIsSorted {
    // O(n) O(1)
    static int[] twoSum(int[] nums, int target) {
        int i=0, j=nums.length-1;
        int[] result = new int[2];
        while (i<j){
            int check = nums[i] + nums[j];
            if (check == target) break;
            if (check < target)
                i++;
            else
                j--;
        }
        result[0] = i+1;
        result[1] = j+1;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
