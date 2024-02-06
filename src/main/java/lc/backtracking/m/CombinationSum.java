package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    // overall TC: O(2^n)
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // SC: O(n)
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking (list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start){
        if (remain<0) return;
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for(int i=start; i<candidates.length; i++){
                tempList.add(candidates[i]);
                backtracking(list, tempList,candidates, remain - candidates[i], i);
                tempList.remove(tempList.size()-1);
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
