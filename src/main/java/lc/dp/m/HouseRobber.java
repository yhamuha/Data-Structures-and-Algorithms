package lc.dp.m;

public class HouseRobber {
    // O(n)
    public int rob(int[] nums) {
       if (nums.length < 2) return nums[0];     // if 1 elem
       // SC: O(n)
       int[] dp = new int[nums.length];         // addit array
       // Memoize
       dp[0] = nums[0];                         // for first house
       dp[1] = Math.max(nums[0], nums[1]);      // for sec house
       for(int i=2; i<nums.length; i++){
           dp[i] = Math.max (dp[i-2] + nums[i], dp[i-1]);
       }
       return dp[nums.length-1];                // ret last elem
    }

    public static void main(String[] args) {
        var hr = new HouseRobber();
        int[] nums = {2,7,3,1,4,2,1,8};
        System.out.println(hr.rob(nums));
    }
}
