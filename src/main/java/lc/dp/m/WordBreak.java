package lc.dp.m;

import lc.backtracking.m.WordSearch;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // SC: O(n)
        boolean[] table = new boolean[s.length()];
        // TC: O(n^2)
        for(int i=0; i<table.length; i++){
            for (int y=0; y<=i; y++){
                if( y ==0 || table[y-1]) {
                    if(wordDict.contains(s.substring(y, i+1))){
                        table[i] = true;
                        break;
                    }
                }
            }
        }
        return table[table.length - 1];
    }

    public static void main(String[] args) {
        var wb = new WordBreak();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        System.out.println(wb.wordBreak(s, wordDict));
    }

}
