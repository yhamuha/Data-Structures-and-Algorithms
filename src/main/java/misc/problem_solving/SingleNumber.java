package misc.problem_solving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,3};
        System.out.println(singleNumber2(nums));
    }

    // O(n^2), O(n)
    static int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            // if list do not contains num -> add
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            // if list contains num -> remove
            } else {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }

    // hashTable
    // O(n), O(n)
    static int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
