package lc.dp.m;

public class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length < 2) return nums[0];
        // SC: O(n)
        int[] skipLastHouse = new int[nums.length-1];
        int[] skipFirstHouse = new int[nums.length-1];
        // TC: O(n)
        for(int i=0; i<nums.length-1; i++){
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i+1];
        }
        int maxFromSkipLastHouse = houseRobber(skipFirstHouse);
        int maxFromSkipFirstHouse = houseRobber(skipLastHouse);
        return Math.max(maxFromSkipLastHouse, maxFromSkipFirstHouse);

    }

    private int houseRobber(int[] nums){
        if(nums.length<2) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1]= Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++){
            dp[i] = (Math.max(dp[i-2] + nums[i], dp[i-1]));
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        var hrII = new HouseRobberII();
        int[] nums = {2,3,2};
        System.out.println(hrII.rob(nums));
    }

}
