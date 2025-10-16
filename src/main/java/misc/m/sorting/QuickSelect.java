package misc.m.sorting;

public class QuickSelect {
    // TC: avg O(n) worst O(n^2)
    public int findKthLargest(int[] nums, int k) {
        int find = nums.length - k;
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            var pivot = partition(nums, lo, hi);
            if (pivot > find) hi = pivot - 1;
            else if (pivot < find) lo = pivot + 1;
            else break;
        }
        return nums[find];
    }

    private int partition(int[] nums, int lo, int hi) {
        int pivot = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (nums[++i] < pivot && i < hi);
            while (nums[--j] > pivot && j > lo);
            if (i >= j) break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        QuickSelect qs = new QuickSelect();
        int result = qs.findKthLargest(nums, k);
        System.out.println(k + "th largest element: " + result);
    }
}
