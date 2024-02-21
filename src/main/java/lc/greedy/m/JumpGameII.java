package lc.greedy.m;

public class JumpGameII {
    // O(n) O(1)
    int jump(int[] nums) {
        int destIdx = nums.length-1;
        int totalJumps =0;
        int lastJumpIdx = 0, coverageIdx = 0;

        if (nums.length == 1) return 0;

        for(int i=0; i<nums.length; i++){
            coverageIdx = Math.max(coverageIdx, i + nums[i]);
            if (i == lastJumpIdx) {
                lastJumpIdx = coverageIdx;
                totalJumps++;
                if(coverageIdx >= destIdx)
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
