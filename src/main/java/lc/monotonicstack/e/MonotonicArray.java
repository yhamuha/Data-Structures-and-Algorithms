package lc.monotonicstack.e;

import java.util.Stack;

public class MonotonicArray {
    // O(n) O(n)
    public boolean isMonotonic(int[] nums) {
        boolean isAsc=nums[0]<nums[nums.length-1];
        return ans(nums,isAsc);
    }
    public boolean ans(int[] nums, boolean isAsc){
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
        MonotonicArray monotonicArray = new MonotonicArray();
        int[] nums = {5,3,2,4,1};
        System.out.println(monotonicArray.isMonotonic(nums));
    }
}
