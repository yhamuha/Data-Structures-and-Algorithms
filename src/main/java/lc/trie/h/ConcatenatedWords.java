package lc.trie.h;

import java.util.ArrayList;
import java.util.List;

public class ConcatenatedWords {
    // O(n * l^2) O(n * l)
    class TrieNode {
        TrieNode[] arr = new TrieNode[26];
        boolean is_end;

        TrieNode() {
            for (int i = 0; i < 26; i++) arr[i] = null;
            is_end = false;
        }
    }

    void insert(TrieNode root, String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.arr[idx] == null)
                curr.arr[idx] = new TrieNode();
            curr = curr.arr[idx];
        }
        curr.is_end = true;
    }

    boolean dfs(TrieNode root, String key, int index, int count) {
        if (index >= key.length())
            return count > 1;
        TrieNode curr = root;
        for (int i = index; i < key.length(); i++) {
            int p = key.charAt(i) - 'a';
            if (curr.arr[p] == null)
                return false;
            curr = curr.arr[p];
            if (curr.is_end) {
                if (dfs(root, key, i + 1, count + 1))
                    return true;
            }
        }
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        TrieNode root = new TrieNode();
        for (int i = 0; i < words.length; i++)
            insert(root, words[i]);
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (dfs(root, words[i], 0, 0))
                ans.add(words[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        ConcatenatedWords cw = new ConcatenatedWords();
        String[] words = {
                "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
        };
        List<String> result = cw.findAllConcatenatedWordsInADict(words);
        for (String w : result)
            System.out.println(w);
    }
}
