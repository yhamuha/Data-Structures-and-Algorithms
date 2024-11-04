package lc.twopointer.m;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    // O(n) O(1)
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int n=0;
        while(i<j){
            if((nums[i]+nums[j])==k){
                i++;
                j--;
                n++;
            }
            else if((nums[i]+nums[j])<k)
                i++;
            else
                j--;
        }
        return n;
    }

    public static void main(String[] args) {
        MaxNumberOfKSumPairs obj = new MaxNumberOfKSumPairs();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(obj.maxOperations(nums, k));
    }
}
