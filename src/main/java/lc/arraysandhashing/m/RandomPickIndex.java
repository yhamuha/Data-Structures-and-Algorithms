package lc.arraysandhashing.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomPickIndex {
    // O(n) O(n)
    Map<Integer,List<Integer>> map;
    public RandomPickIndex(int[] nums) {
        map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> list = map.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }
    }
    public int pick(int target) {
        List<Integer> list = map.get(target);
        int len = list.size();
        int ind = (int)(Math.random() * len);
        return list.get(ind);
    }

    public static void main(String[] args) {
        RandomPickIndex rpi = new RandomPickIndex(new int[]{1, 2, 3, 3, 3});
        System.out.print(rpi.pick(3) + " ");
        System.out.print(rpi.pick(1) + " ");
        System.out.print(rpi.pick(3));
    }
}
