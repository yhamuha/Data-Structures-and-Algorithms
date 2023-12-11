package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        generateSubset(0, nums, new ArrayList(), list);
        return list;
    }

    public void generateSubset(int index, int[]nums, List<Integer> current, List<List<Integer>> list){
        list.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            generateSubset(i+1, nums, current, list);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        var s = new Subsets();
        System.out.println(s.subsets(nums));
    }
}
