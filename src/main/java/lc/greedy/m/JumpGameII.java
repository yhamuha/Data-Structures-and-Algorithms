package lc.greedy.m;

public class JumpGameII {
    // O(n) O(1)
    int jump(int[] nums) {
        int destinationIdx = nums.length - 1;
        int coverageIdx = 0, lastJumpIdx = 0;
        int totalJumps = 0;
        for (int i = 0; i <= nums.length; i++) {
            coverageIdx = Math.max(coverageIdx, i + nums[i]);
            if (lastJumpIdx == i) {
                lastJumpIdx = coverageIdx;
                totalJumps++;
                if (coverageIdx >= destinationIdx)
                    return totalJumps;
            }
        }
        return totalJumps;
    }

    public static void main(String[] args) {
        var jg = new JumpGameII();
        int[] nums = {2,3,1,1,4};
        System.out.println(jg.jump(nums));
    }
}
