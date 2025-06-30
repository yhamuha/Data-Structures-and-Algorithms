package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // O(n×n!) O(n×n!)
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backtracking(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for (int num : nums) {
            if (tempList.contains(num)) continue;
            tempList.add(num);
            backtracking(resultList, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        var p = new Permutations();
        int[] nums = {1, 2, 3};
        System.out.println(p.permute(nums));
    }
}
