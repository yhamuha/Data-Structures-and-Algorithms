package lc.linkedlist.m;

public class FindTheDuplicateNumber {
    // O(n) O(1)
    public int findDuplicate(int[] nums){
        if (nums.length < 1)    return -1;
        int slow = nums[0], fast=nums[0];
        while(fast != nums.length)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
                break;
        }
        slow=nums[0];
        while(fast != slow)
        {
            fast=nums[fast];
            slow=nums[slow];
        }
        return slow;
    }
    public static void main(String[] args) {
        FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(solution.findDuplicate(nums));
    }
}
