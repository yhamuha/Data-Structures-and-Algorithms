package lc.dp.m;

public class HouseRobber {
    // O(n) O(n)
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] maxAmount = new int[nums.length];
        maxAmount[0] = nums[0];
        maxAmount[1] = Math.max(nums[0], nums[1]);

        for (int i =2; i< nums.length; i++) {
            maxAmount[i] = Math.max(maxAmount[i-2] + nums[i], maxAmount[i-1]);
        }
        return maxAmount[maxAmount.length-1];
    }

    public static void main(String[] args) {
        var hr = new HouseRobber();
        int[] nums = {1,2,3,1};
        System.out.println(hr.rob(nums));
    }
}
