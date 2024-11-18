package lc.arraysandhashing.e;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    // O(n) O(1)
    public int longestPalindrome(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray())
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        int length = 0;
        boolean hasoddcount = false;
        for (int count : freqMap.values()){
            if(count%2==0)
                length +=count;
            else {
                length +=count -1;
                hasoddcount = true;
            }
        }
        if (hasoddcount)
            return length+1;
        else
            return length;
    }

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        String input = "abccccdd";
        System.out.println(solution.longestPalindrome(input));
    }
}
