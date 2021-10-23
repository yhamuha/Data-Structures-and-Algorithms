package misc.problem_solving;

/**
 *
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
            s+=nums[i];
        int sum=nums.length*(1+nums.length)/2;
        return Math.abs(s-sum);
    }
}
