package lc.heap_priority_queue;

import java.util.*;

public class TopKFrequentElements {
    // TC: O(n log n)
    // SC: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);     // 1-3, 2-2, etc...
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = // heap by max values
                new PriorityQueue<>((a,b)-> (b.getValue() - a.getValue()));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }
        int[] result = new int[k];
        int index = 0;
        while (index < k){
            Map.Entry<Integer,Integer> entry = maxHeap.poll();
            result[index] = entry.getKey();
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        var tkfe = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(tkfe.topKFrequent(nums, k)));
    }
}
