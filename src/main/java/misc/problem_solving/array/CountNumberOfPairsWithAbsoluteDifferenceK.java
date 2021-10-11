package misc.problem_solving.array;

/**
 *
 */
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        System.out.println(countKDifference2(nums, k));
    }

    // brute force
    // 16 ms
    static int countKDifference(int[] nums, int k) {

        int result = 0;

        for( int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length;j++) {
                if ((Math.abs(nums[i] - nums[j]) == k) || (Math.abs(nums[j] - nums[i]) == k)) {
                    result++;
                }
            }
        }

        return result;
    }

    // O(n)
    static int countKDifference2(int[] nums, int k) {
        int sum=0;
        int[] arr=new int[100];
        for(int i=0;i<nums.length;i++) {
            arr[nums[i]-1]++;
        }
        for(int i=0;i<100-k;i++) {
            sum+=arr[i]*arr[i+k];
        }
        return sum;
    }
}
