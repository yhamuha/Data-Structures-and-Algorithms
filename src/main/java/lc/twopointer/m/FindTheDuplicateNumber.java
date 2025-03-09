package lc.twopointer.m;

public class FindTheDuplicateNumber {
    // O(n) O(1)
    static int findDuplicate(int[] nums) {
        int slow=0, fast=0;
        int check = 0;
        while( true ) {
            slow = nums[slow];
            fast = nums[ nums[fast] ];
            if( slow == fast )
                break;
        }
        while( true ) {
            slow = nums[slow];
            check = nums[check];
            if( slow == check )
                break;
        }
        return check;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}
