package lc.arraysandhashing.e;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    // O(n) O(n)
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i : arr)
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        for(int key : freqMap.keySet()) {
            int value = freqMap.get(key);
            if(!set.contains(value))
                set.add(value);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(solution.uniqueOccurrences(arr));
    }
}
