package lc.twopointer.e;

public class RemoveDuplicatesFromSortedArray {
    //O(n) O(1)
    public int removeDuplicates(int[] nums) {
        int k=1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]!=nums[i-1]) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println(obj.removeDuplicates(nums));
    }
}
