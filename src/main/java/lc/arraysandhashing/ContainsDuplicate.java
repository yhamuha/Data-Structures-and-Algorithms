package lc.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    static public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // O(n^2) O(1)
        for (int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // O(n) O(n)
    static public boolean containsDuplicateEnhanced(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    // O(n) O(1)
    static public boolean containsDuplicateBitmanipulation(int[] nums) {
        long checker = 0L;
        for (int num : nums) {
            long mask = 1L << num; // get unique bit mask for each num
            // 0001 left shift for each of 3,2,3 numbers
            if ((checker & mask) > 0) { // check if bit identifier match
                return true;
            }
            checker |= mask; // save particular bit from each bit mask for each num
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
         // System.out.println(containsDuplicate(arr));
         // System.out.println(containsDuplicateEnhanced(arr));
         System.out.println(containsDuplicateBitmanipulation(arr));

    }
}
