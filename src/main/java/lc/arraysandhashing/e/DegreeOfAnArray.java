package lc.arraysandhashing.e;

import java.util.HashMap;

public class DegreeOfAnArray {
    // O(n) O(n)
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> freqMap = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (!freqMap.containsKey(val))
                freqMap.put(val, new int[]{i, i, 1});
            else {
                int[] arr = freqMap.get(val);
                arr[1] = i;
                arr[2]++;
            }
            degree = Math.max(degree, freqMap.get(val)[2]);
        }
        int length = nums.length;
        for (int key : freqMap.keySet()) {
            int[] arr = freqMap.get(key);
            if (arr[2] == degree) {
                length = Math.min(length, arr[1] - arr[0] + 1);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
