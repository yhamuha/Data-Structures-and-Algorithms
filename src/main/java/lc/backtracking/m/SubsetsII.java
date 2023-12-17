package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);

        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, List<Integer> tempSet,
                           int[] nums, int start) {
        if (resultList.contains((tempSet)))
            return;

        resultList.add(new ArrayList<>(tempSet));

        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);
            backtrack(resultList, tempSet, nums, i + 1);
            tempSet.remove(tempSet.size() - 1);
        }
    }

    public static void main(String[] args) {
        var sII = new SubsetsII();
        int[] nums = {1,2,2};
        System.out.println(sII.subsetsWithDup(nums));
    }
}
