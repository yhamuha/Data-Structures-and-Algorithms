package lc.arraysandhashing.e;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    // O(n) O(n)
    static public boolean containsDuplicateEnhanced(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
         System.out.println(containsDuplicateEnhanced(arr));
    }
}


