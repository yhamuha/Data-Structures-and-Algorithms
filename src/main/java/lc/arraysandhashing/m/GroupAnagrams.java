package lc.arraysandhashing.m;

import java.util.*;

public class GroupAnagrams {
    // O(n log n) O(n)
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = String.valueOf(chars);
            if(!groupedAnagrams.containsKey(sortedString)){
                groupedAnagrams.put(sortedString,new ArrayList<>());
            }
            groupedAnagrams.get(sortedString).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"eat", "tea", "cat", "bca", "abc", "dac"};
        System.out.println(groupAnagrams(strs));
    }
}
