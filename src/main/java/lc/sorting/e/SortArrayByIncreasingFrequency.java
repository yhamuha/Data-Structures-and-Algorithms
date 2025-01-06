package lc.sorting.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortArrayByIncreasingFrequency {
    // O(n log n) O(n)
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            list.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Collections.sort(list, (a, b) ->
                (map.get(a) == map.get(b)) ? b-a : map.get(a)-map.get(b));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sorter = new SortArrayByIncreasingFrequency();
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] sorted = sorter.frequencySort(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
