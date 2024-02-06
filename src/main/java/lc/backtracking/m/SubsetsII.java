package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    // TC: O(2^n) because of line 19
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // SC: O(n)
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private void backtracking (List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start){
        if (resultList.contains(tempList)) return;

        resultList.add(new ArrayList<>(tempList));

        for(int i=start; i<nums.length; i++) {
            tempList.add(nums[i]);
            backtracking(resultList, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        var sII = new SubsetsII();
        int[] nums = {1,2,2};
        System.out.println(sII.subsetsWithDup(nums));
    }
}
