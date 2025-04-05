package lc.monotonicstack.e;

import java.util.Stack;

public class MonotonicArray {
    // O(n) O(n)
    static boolean isMonotonic(int[] nums) {
        boolean isAsc=nums[0]<nums[nums.length-1];
        return ans(nums,isAsc);
    }
    static boolean ans(int[] nums, boolean isAsc){
        Stack<Integer> stack=new Stack<>();
        if(isAsc){
            for(int i:nums){
                if(!stack.isEmpty() && stack.peek()>i){
                    return false;
                }
                stack.push(i);
            }
            return true;
        }
        for(int i:nums){
            if(!stack.isEmpty() && stack.peek()<i)
                return false;
            stack.push(i);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(isMonotonic(nums));
    }
}
