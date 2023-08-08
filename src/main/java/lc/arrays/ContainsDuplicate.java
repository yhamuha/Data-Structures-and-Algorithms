package lc.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    static public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    static public boolean containsDuplicateEnhanced(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicateEnhanced(arr));
    }
}
