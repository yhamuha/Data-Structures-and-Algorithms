package lc.arraysandhashing.m;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        int arrSize = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null ) {
                for (Integer integer : bucket[pos]) {
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
        int[] nums = {1,1,1,1,2,2,3,3,4};
        int k = 2;
        TopKFrequentElements tkfe = new TopKFrequentElements();
        System.out.println(Arrays.toString(tkfe.topKFrequent(nums, k)));
    }
}
