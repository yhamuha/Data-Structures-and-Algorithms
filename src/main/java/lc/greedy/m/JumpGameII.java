package lc.greedy.m;

public class JumpGameII {
    // O(n) O(1)
    int jump(int[] nums) {
        int destinationIndex = nums.length - 1;
        int coverageIndex = 0, lastJumpIndex = 0;
        int totalJumps = 0;
        for (int i = 0; i <= nums.length; i++) {
            coverageIndex = Math.max(coverageIndex, i + nums[i]);
            if (lastJumpIndex == i) {
                lastJumpIndex = coverageIndex;
                totalJumps++;
                if (coverageIndex >= destinationIndex)
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
