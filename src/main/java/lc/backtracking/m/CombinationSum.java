package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        // O (n log n)
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }
    // briefly: O (n^2)
    // deeply: O (n ^ (T/M + 1)) where T is target, M - min of nums;
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        var cs = new CombinationSum();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(cs.combinationSum(candidates,target));
    }
}
