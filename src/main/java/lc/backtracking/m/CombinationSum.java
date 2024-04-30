package lc.backtracking.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    // O(2^n)
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(resultList, new ArrayList<>(), candidates, target, 0);
        return resultList;
    }

    private void backtracking(List<List<Integer>> resultList, ArrayList<Integer> tempList,
                                int[] candidates, int remains, int start) {
        if (remains < 0) return;
        else if (remains == 0) resultList.add(new ArrayList<>(tempList));
        else {
            for(int i=start; i<candidates.length; i++){
                tempList.add(candidates[i]);
                backtracking(resultList,tempList,candidates,remains-candidates[i],i);
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
