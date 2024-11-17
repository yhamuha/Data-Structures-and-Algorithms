package lc.slidingwindow.m;

public class MinimumSizeSubarraySum {
    // O(n) O(1)
    static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int w_sum = 0;
        int start = 0;
        for(int i = 0; i<n; i++){
            w_sum+=nums[i];
            while(w_sum>=target){
                ans= Math.min(ans, i-start+1);
                w_sum-=nums[start];
                start++;
            }
        }
        return ans == Integer.MAX_VALUE?0:ans;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }
}