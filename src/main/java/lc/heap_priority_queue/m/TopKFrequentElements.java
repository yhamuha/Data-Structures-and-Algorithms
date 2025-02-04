package lc.heap_priority_queue.m;

import java.util.*;

public class TopKFrequentElements {
    // O(n log m) O(m)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap =
                new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));
        maxHeap.addAll(freqMap.entrySet());
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
        int[] nums = {1,1,1,2,2,3}; int k = 2;
        System.out.println(Arrays.toString(tkfe.topKFrequent(nums, k)));
    }
}
