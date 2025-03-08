package lc.twopointer.m;

import java.util.*;

public class Find4Sum {
    // O(n^2) O(n)
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                int start = j+1;
                int end = nums.length-1;
                while(end>start){
                    sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target)
                        set.add(Arrays.asList(nums[i], nums[j], nums[start++], nums[end--]));
                    else if (sum > target) end--;
                    else start++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }
}
