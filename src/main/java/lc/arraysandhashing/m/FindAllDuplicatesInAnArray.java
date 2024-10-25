package lc.arraysandhashing.m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    // O(n) O(n)
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i]))
                list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray finder = new FindAllDuplicatesInAnArray();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(finder.findDuplicates(nums));
    }
}
