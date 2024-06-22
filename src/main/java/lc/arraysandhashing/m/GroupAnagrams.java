package lc.arraysandhashing.m;

import java.util.*;

public class GroupAnagrams {
    // O(n log n) O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupedAnagrams = new HashMap<>();
        for (String str : strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedString = String.valueOf(strArray);
            if (!groupedAnagrams.containsKey(sortedString))
                groupedAnagrams.put(sortedString, new ArrayList<>());
            groupedAnagrams.get(sortedString).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = new String[] {"eat", "tea", "cat", "bca", "abc"};
        System.out.println(ga.groupAnagrams(strs));
    }
}
