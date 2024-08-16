package lc.greedy.m;

public class JumpGame {
    // O(n) O(1)
    public boolean canJump(int[] nums) {
        int lastIndex = 0;
        int n = nums.length-1;
        for(int i=n; i>=0; i--){
            if(i+nums[i] >= lastIndex)
                lastIndex =i;
        }
        return lastIndex == 0;
    }

    public static void main(String[] args) {
        var jgame = new JumpGame();
        int[] nums = {2,3,1,1,4};
        System.out.println(jgame.canJump(nums));
    }
}
