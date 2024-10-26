package lc.arraysandhashing.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    // O(n) O(n)
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i< nums.length; i++)
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        List<Integer> majorityElement = new ArrayList<>();
        int threshold = nums.length/3;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > threshold)
                majorityElement.add(element);
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        MajorityElementII obj = new MajorityElementII();
        int[] nums = {3,2,3};
        System.out.println(obj.majorityElement(nums));
        int[] nums2 = {1,2,3,4,5,6,7,8,8,8,8};
        System.out.println(obj.majorityElement(nums2));
    }
}
