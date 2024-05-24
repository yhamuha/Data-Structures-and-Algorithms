package lc.arraysandhashing.m;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    // O(n) O(n)
/*    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer,Boolean> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, Boolean.FALSE);
        }

        for (int num : nums)  {
            int currentLength = 1;

            int nextNum = num + 1;
            while ( map.containsKey(nextNum) &&
                    map.containsValue(nextNum) == false) {
                currentLength++;
                map.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            int prevNum = num - 1;
            while (map.containsKey(prevNum) &&
                   map.containsValue(prevNum) == false) {
                currentLength++;
                map.put(num, Boolean.FALSE);
                prevNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;
    }*/

    public int longestConsecutive(int[] nums) {

        int longestLength = 0;

        Map<Integer, Boolean> map = new HashMap();
        for (int num : nums) {
            map.put(num, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentLength = 1;
            int nextNum = num + 1;
            while (map.containsKey(nextNum) && map.get(nextNum) == false) {
                currentLength++;
                map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            int prevNum = num + 1;
            while (map.containsKey(prevNum) && map.get(prevNum) == false) {
                currentLength++;
                map.put(prevNum,Boolean.TRUE);
                prevNum++;
            }
            longestLength = Math.max(longestLength, currentLength);
        }
    return longestLength;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        System.out.println(lcs.longestConsecutive(nums));
    }
}
