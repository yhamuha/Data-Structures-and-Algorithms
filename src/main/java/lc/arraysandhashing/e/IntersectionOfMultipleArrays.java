package lc.arraysandhashing.e;

import java.util.*;

public class IntersectionOfMultipleArrays {
    //T: O(n log n) S: O(n)
    public List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int arr[] : nums){
            for(int num : arr)
                freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        int n = nums.length;
        List<Integer> resultList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if (entry.getValue() == n)
                resultList.add(entry.getKey());
        }
        Collections.sort(resultList);
        return resultList;
    }

    public static void main(String[] args) {
        IntersectionOfMultipleArrays solution = new IntersectionOfMultipleArrays();
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        List<Integer> result = solution.intersection(nums);
        System.out.println(result);
    }
}
