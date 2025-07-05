package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    // O(n*n!) O(n*n!)
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resultList;
    }

    private void backtracking(List<List<Integer>> resultList, List<Integer> temp, int[] nums, boolean[] b) {
        if (temp.size() == nums.length)
            resultList.add(new ArrayList<>(temp));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (b[i] || i > 0 && nums[i] == nums[i - 1] && !b[i - 1])
                    continue;
                b[i] = true;
                temp.add(nums[i]);
                backtracking(resultList, temp, nums, b);
                b[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        var p = new PermutationsII();
        int[] nums = {1, 1, 2};
        System.out.println(p.permuteUnique(nums));
    }
}
