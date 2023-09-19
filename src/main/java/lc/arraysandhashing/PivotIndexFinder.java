package lc.arraysandhashing;

public class PivotIndexFinder {

    class Solution {
        public int pivotIndex(int[] nums) {
            // define total
            int total = 0;
            for (int n: nums) {
                total += n;
            }

            int leftSum = 0;

            for (int i=0; i < nums.length; i++) {
                int rightSum = total - leftSum - nums[i];
                if (leftSum == rightSum) return i;
                leftSum += nums[i];
            }
            return -1;
        }
    }


// 1 2 4 3      return: 3
// 1 2 3        return: -1

// 1 2 4 3      total  10
//              i 0 1 2
//              leftSum 3
//              rightSum 10 - 3 - 4 = 3
//
// TC: O(n); SC: O(1)
}
