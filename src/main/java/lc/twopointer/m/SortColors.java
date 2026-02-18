package lc.twopointer.m;

public class SortColors {
    // O(n) O(1)
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        int[] colors = {2,0,2,1,1,0};
        sorter.sortColors(colors);
        for (int color : colors)
            System.out.print(color + " ");
    }
}
