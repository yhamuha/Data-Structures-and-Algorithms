package lc.dynamicprogramming.e;

public class RangeSumQueryImmutable {
    int[] leftSideSum;
    int[] rightSideSum;
    int totalSum = 0;

    // O(n) O(n)
    public RangeSumQueryImmutable(int[] nums) {
        leftSideSum = new int[nums.length];
        rightSideSum = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSideSum[i] = sum;
            sum += nums[i];
        }
        totalSum = sum;

        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSideSum[i] = sum;
            sum += nums[i];
        }
    }
    // TC O(1)
    public int sumRange(int left, int right) {
            return totalSum - (leftSideSum[left] + rightSideSum[right]);
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable rsq = new RangeSumQueryImmutable(nums);
        System.out.println(rsq.sumRange(0, 2));
        System.out.println(rsq.sumRange(2, 5));
        System.out.println(rsq.sumRange(0, 5));
    }
}
