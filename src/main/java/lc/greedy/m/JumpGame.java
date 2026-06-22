package lc.greedy.m;

public class JumpGame {
    // O(n) O(1) #bloomberg
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= lastIndex)
                lastIndex = i;
        }
        return lastIndex == 0;
    }
    public static void main(String[] args) {
        var jgame = new JumpGame();
        int[] nums = {3,2,1,0,4};
        System.out.println(jgame.canJump(nums));
    }
}
