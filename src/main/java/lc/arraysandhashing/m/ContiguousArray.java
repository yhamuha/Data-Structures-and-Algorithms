package lc.arraysandhashing.m;

import java.util.HashMap;

public class ContiguousArray {
    // O(n) O(n)
    public int findMaxLength(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        int max = 0;
        int currentDiff = 0;
        for(int i = 0; i<nums.length; i++){
            currentDiff += nums[i] == 1 ? 1 :-1;
            if(currentDiff==0)
                max = i + 1;
            if(!map.containsKey(currentDiff))
                map.put(currentDiff, i);
            else
                max = Math.max(max, i - map.get(currentDiff));
        }
        return max;
    }

    public static void main(String[] args) {
        ContiguousArray ca = new ContiguousArray();
        int[] nums = {0,0,0,1,1,1,1,0};
        System.out.println(ca.findMaxLength(nums));
    }
}
