package lc.trie.m;

import java.util.List;

public class WordBreak {
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    // Overall O(d*m + n^2) O(d*m + n)
    public static Node root = new Node();
    // O(d*m)
    public static void insert(String words){
        Node curr = root;
        for(int i=0; i<words.length(); i++){
            int idx = words.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }
    // O(n^2)
    public static boolean search(String key, int start, int end){
        Node curr = root;
        for(int i=start; i<=end; i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord == true;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        root = new Node();
        for(String word: wordDict){
            insert(word);
        }
        int n = s.length();
        boolean[] dp = new boolean[n];

        // O(n^2)
        for(int j=0; j<n; j++){
            for(int i=0; i<=j; i++){
                if(search(s, i, j)){
                    dp[j] = (i-1 >=0)? dp[i-1] : true;
                    if (dp[j]) break;
                }
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        var wb = new WordBreak();
        String s = "catsandog";
        List<String> dict = List.of("cats","dog","sand","and","cat");
        System.out.println(wb.wordBreak(s, dict));
    }
}
