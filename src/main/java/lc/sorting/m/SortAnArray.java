package lc.sorting.m;

public class SortAnArray {
    // O(n) O(1)
    public int[] sortArray(int[] nums) {
        int[] map = new int[100001];
        for (int n : nums)
            map[n + 50000]++;
        int k = 0;
        for (int i = 0; i < 100001; i++)
            for (int j = 0; j < map[i]; j++)
                nums[k++] = i - 50000;
        return nums;
    }

    public static void main(String[] args) {
        SortAnArray sorter = new SortAnArray();
        int[] nums = {5, 2, 3, 1};
        int[] sortedArray = sorter.sortArray(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
