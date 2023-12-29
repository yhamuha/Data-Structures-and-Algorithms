package lc.greedy.m;

public class JumpGame {
    // O(n)
    public boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length - 1;
        for (int i=nums.length-1; i>=0; i--) {
            if (i + nums[i] >= lastGoodIndexPosition)
                lastGoodIndexPosition = i;
        }
        return lastGoodIndexPosition == 0;
    }

    public static void main(String[] args) {
        var jgame = new JumpGame();
        int[] nums = {2,3,1,1,4};
        System.out.println(jgame.canJump(nums));
    }
}
