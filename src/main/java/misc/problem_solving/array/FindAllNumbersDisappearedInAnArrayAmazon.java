package misc.problem_solving.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FindAllNumbersDisappearedInAnArrayAmazon {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        boolean[] storage = new boolean[nums.length + 1];

        for(int num: nums){
            storage[num] = true;
        }

        for(int i = 1; i < storage.length; ++i) {
            if(!storage[i]) list.add(i);
        }

        return list;
    }
}
