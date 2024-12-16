package lc.trie.m;

public class ImplementTrie_PrefixTree {

        private TrieNode root;
        class TrieNode {
            TrieNode[] children = new TrieNode[26];
            boolean isEnd = false;
        }
        public ImplementTrie_PrefixTree() {
            root = new TrieNode();
        }
        // O(L) O(N * L)
        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }
        // O(L) O(N * L)
        public boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null)
                    return false;
                node = node.children[index];
            }
            return node.isEnd;
        }
        // O(P) O(N * L)
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (char c : prefix.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null)
                    return false;
                node = node.children[index];
            }
            return true;
        }

    public static void main(String[] args) {
        ImplementTrie_PrefixTree trie = new ImplementTrie_PrefixTree();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
