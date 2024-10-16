package lc.arraysandhashing.m;

public class RemoveDuplicatesFromSortedArrayII {
    // O(n) O(1)
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII remover = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = remover.removeDuplicates(nums);
        System.out.println(newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
