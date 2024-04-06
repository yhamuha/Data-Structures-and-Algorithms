package lc.arraysandhashing;

import java.util.*;

public class IntersectionOfMultipleArrays {
    //T: O(n log n) S: O(n)
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : nums) {    // freq map from 2d int[][]
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int n = nums.length;    // num of subassrays
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {    // if entry contains particular number in each of subarrays
                res.add(entry.getKey());
            }
        }
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        IntersectionOfMultipleArrays solution = new IntersectionOfMultipleArrays();
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> result = solution.intersection(nums);
        System.out.println(result);
    }
}
