package misc.problem_solving.array;

/**
 *
 */
public class MissingNumberCapitalOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(missingNumber(nums));
    }




    // the key:
    // 1) sum elements of array
    // 2) arr_leng + (1 + arr_len) / 2

    static public int missingNumber(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
            s+=nums[i];
        int sum=nums.length*(1+nums.length)/2;
        return Math.abs(s-sum);
    }
}
