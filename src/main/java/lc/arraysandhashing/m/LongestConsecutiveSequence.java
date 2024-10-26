package lc.arraysandhashing.m;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
        // O(n) O(n)
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums)
            map.put(num, false);
        for (int num : nums) {
            int currentLength = 1;
            int nextNum = num + 1;
            while (map.containsKey(nextNum) && !map.get(nextNum)) {
                currentLength++;
                map.put(nextNum,true);
                nextNum++;
            }
            int prevNum = num - 1;
            while (map.containsKey(prevNum) && !map.get(prevNum)) {
                currentLength++;
                map.put(prevNum,true);
                prevNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2,5,6};
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        System.out.println(lcs.longestConsecutive(nums));
    }
}
