package lc.twopointer.e;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    // O(n) O(n)
    static int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        int left = 0, right = 1;
        int counter = 0;
        while(left <= right && right < nums.length){
            if (nums[right] - nums[left] < diff)
                right++;
            else if (nums[right] - nums[left] > diff)
                left++;
            else {
                if (set.contains(nums[right]+diff))
                    counter++;
                left++;
                right++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }
}
