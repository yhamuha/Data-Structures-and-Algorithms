package lc.twopointer.e;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    // O(n) O(n)
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        int prev = 0, next = 1;
        int counter = 0;
        while(prev <= next && next < nums.length){
            if (nums[next] - nums[prev] < diff)
                next++;
            else if (nums[next] - nums[prev] > diff)
                prev++;
            else {
                if (set.contains(nums[next]+diff))
                    counter++;
                prev++;
                next++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        NumberOfArithmeticTriplets nat = new NumberOfArithmeticTriplets();
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(nat.arithmeticTriplets(nums, diff));
    }
}
