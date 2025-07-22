package lc.arraysandhashing.m;

import java.util.*;

public class TopKFrequentElements {
    // O(n) O(n)
    static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1]; // +1 to avoid 0-index
        // create frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums)
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        // iterate by keys in map
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            // if freq isn't present in bucket
            if (bucket[freq] == null)
                // create new list there
                bucket[freq] = new ArrayList<>();
            // save element under frequency number
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int counter = 0, arrSize = 0;
        // we are started iterate from the END of bucket
        // in this way it's automatically sorted from big to small frequency
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (Integer integer : bucket[i]) {
                    if (arrSize < k) {
                        res[counter++] = integer;
                        arrSize++;
                    } else break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}

