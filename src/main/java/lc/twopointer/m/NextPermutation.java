package lc.twopointer.m;

public class NextPermutation {
    // O(n) O(1)
    public void nextPermutation(int[] nums) {
        int index1 = -1;
        int index2 = -1, n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
                break;
            }
        }
        if (index1 == -1) {
            reverse(nums, 0);
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[index1]) {
                swap(nums, index1, i);
                break;
            }
        }
        reverse(nums, index1 + 1);
    }

    void reverse(int[] a, int start) {
        int end = a.length - 1;
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] nums = {1, 2, 3};
        np.nextPermutation(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }
}
