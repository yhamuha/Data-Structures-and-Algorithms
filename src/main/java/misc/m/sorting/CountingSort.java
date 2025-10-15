package misc.m.sorting;

public class CountingSort {
    // O(n+k) O(k)
    void countingSort(int[] nums, int max) {
        int[] freq = new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }

        int current = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int count = 0; count < freq[i]; count++) {
                nums[current] = i;
                current++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 8, 3, 3, 1};
        int max = 8;
        CountingSort sorter = new CountingSort();
        sorter.countingSort(nums, max);
        for (int n : nums)
            System.out.print(n + " ");
    }
}
