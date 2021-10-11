package misc.problem_solving.array;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        System.out.println(countKDifference3(nums, k));
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

    //
    static int countKDifference3(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < nums.length ; i++) {
            int complement = Math.abs(nums[i] - k);
            int complement1 = Math.abs(nums[i] + k);
            if(hm.containsKey(complement) && Math.abs(nums[i] - complement ) == k) {
                ans += hm.get(complement);
            }
            if(hm.containsKey(complement1)) {
                ans += hm.get(complement1);
            }

            hm.put(nums[i], hm.getOrDefault(nums[i],0) +1);

        }
        return ans;
    }
}
