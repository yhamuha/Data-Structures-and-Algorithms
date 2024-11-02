package lc.twopointer.m;

public class RemoveDuplicatesFromSortedArrayII {
    //O(n) O(1)
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(i<2 || nums[j]> nums[i-2])
                nums[i++]=nums[j];
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII obj = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(obj.removeDuplicates(nums));
    }
}
