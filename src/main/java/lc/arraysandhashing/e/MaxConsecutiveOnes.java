package lc.arraysandhashing.e;

public class MaxConsecutiveOnes {
    // O(n) O(1)
    static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;

        for (int n : nums) {
            if (n == 0) {
                count = 0;
            } else {
                count++;
            }

            if (res < count) {
                res = count;
            }
        }

        return res;
    }

    public static void main(String[] str) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
