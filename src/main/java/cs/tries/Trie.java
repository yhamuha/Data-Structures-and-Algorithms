package cs.tries;

public class Trie {

    TrieNode root = new TrieNode();

    public void insert(String str) {
        TrieNode node = root;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!node.letters.containsKey(letter))
                node.letters.put(letter, new TrieNode());
            node = node.letters.get(letter);
        }
        node.markAsWordEnd();
    }
}
