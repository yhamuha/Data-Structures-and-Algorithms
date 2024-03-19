package lc.twopointer;

public class SquaresOfASortedArray {
    // O(n) O(n)
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[left] > nums[right]) {
                result[i] = nums[left];
                left++;
            } else {
                result[i] = nums[right];
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SquaresOfASortedArray obj = new SquaresOfASortedArray();

        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
