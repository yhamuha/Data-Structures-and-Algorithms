package lc.twopointer.m;

import java.util.Arrays;

public class Find3SumClosest {
    // O(n^2) O(1)
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - closestSum))
                    closestSum = sum;
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        Find3SumClosest find3sumClosest = new Find3SumClosest();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(find3sumClosest.threeSumClosest(nums, target));
    }
}
