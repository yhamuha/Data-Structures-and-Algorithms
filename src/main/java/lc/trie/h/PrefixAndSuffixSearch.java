package lc.trie.h;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrefixAndSuffixSearch {
    private TrieNode rootPrefix, rootSuffix;
    private Map<String, Integer> indexes;
    class TrieNode {
        public Map<Character, TrieNode> children;
        public Set<String> words;
        public TrieNode() {
            children = new HashMap<>();
            words = new HashSet<>();
        }
    }
    public PrefixAndSuffixSearch(String[] words) {
        rootPrefix = new TrieNode();
        rootSuffix = new TrieNode();
        indexes = new HashMap<>();
        for (int i=0; i<words.length; i++) {
            insert(words[i]);
            indexes.put(words[i], i);
        }
    }
    // O(N * L) O(N * L)
    private void insert(String word) {
        TrieNode ptrPrefix = rootPrefix, ptrSuffix = rootSuffix;
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if (!ptrPrefix.children.containsKey(c))
                ptrPrefix.children.put(c, new TrieNode());
            ptrPrefix = ptrPrefix.children.get(c);
            ptrPrefix.words.add(word);
            c = word.charAt(word.length()-1-i);
            if (!ptrSuffix.children.containsKey(c))
                ptrSuffix.children.put(c, new TrieNode());
            ptrSuffix = ptrSuffix.children.get(c);
            ptrSuffix.words.add(word);
        }
    }
    // O(P + S) O(N * L)
    public int f(String prefix, String suffix) {
        TrieNode ptrPrefix = rootPrefix, ptrSuffix = rootSuffix;
        for (int i=0; i<prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (!ptrPrefix.children.containsKey(c)) return -1;
            ptrPrefix = ptrPrefix.children.get(c);
        }
        Set<String> prefixes = ptrPrefix.words;
        for (int i=0; i<suffix.length(); i++) {
            char c = suffix.charAt(suffix.length()-1-i);
            if (!ptrSuffix.children.containsKey(c)) return -1;
            ptrSuffix = ptrSuffix.children.get(c);
        }
        Set<String> suffixes = ptrSuffix.words;
        int index = -1;
        for (String word: prefixes)
            if (suffixes.contains(word))
                index = Math.max(index, indexes.get(word));
        return index;
    }

    public static void main(String[] args) {
        String[] words = {"apple"};
        PrefixAndSuffixSearch wordFilter = new PrefixAndSuffixSearch(words);
        System.out.println(wordFilter.f("a", "e"));
    }
}


