package lc.greedy.m;

public class JumpGameII {
    int jump(int[] nums) {

        int totalJumps = 0;

        int destination = nums.length - 1;
        int coverage = 0, lastJumpIdx = 0;

        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;
                if (coverage >= destination) {
                    return totalJumps;
                }
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
