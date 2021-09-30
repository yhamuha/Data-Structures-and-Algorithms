package misc.problem_solving;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,3};
        System.out.println(singleNumber(nums));
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
}
