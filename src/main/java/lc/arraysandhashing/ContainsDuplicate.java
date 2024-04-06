package lc.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    static public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // O(n^2) O(1)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // O(n) O(n)
    static public boolean containsDuplicateEnhanced(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
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
            long mask = 1L << num;
            if ((checker & mask) > 0) { // if bit present in checker
                return true;
            }
            checker |= mask; // otherwise assign mask to checker
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        // System.out.println(containsDuplicate(arr));
        // System.out.println(containsDuplicateEnhanced(arr));
        System.out.println(containsDuplicateBitmanipulation(arr));

    }
}
