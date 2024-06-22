package lc.twopointer.m;

import java.util.Arrays;

public class TwoSum_II_InputArrayIsSorted {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0, j = nums.length-1;
        while(i < j){
            int check = nums[i]+nums[j];
            if(check == target) break;
            if(check < target) i++;
            else j--;
        }
        res[0] = i+1;
        res[1] = j+1;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum_II_InputArrayIsSorted twoSum = new TwoSum_II_InputArrayIsSorted();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
