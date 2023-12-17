package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        // O (n log n)
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    // briefly: O (n^2)
    // deeply: O (n ^ (T/M + 1)) where T is target, M - min of candidates;
    // in worst case extent depends on T-target and M-min of candidates array
    private void backtrack(List<List<Integer>> list, List<Integer> tempList,
                           int [] candidates, int remain, int start){
        if (remain < 0) return;
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for(int i = start; i < candidates.length; i++){
                tempList.add(candidates[i]);
                backtrack(list, tempList, candidates, remain - candidates[i], i);
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
