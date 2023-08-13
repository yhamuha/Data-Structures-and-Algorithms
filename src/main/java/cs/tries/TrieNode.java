package cs.tries;

import java.util.HashMap;

class TrieNode {
    HashMap<Character, TrieNode> letters = new HashMap<>();
    boolean hasLetters() {
        return letters.size() != 0;
    }
    void markAsWordEnd() {
        letters.put('\0', null);
    }
    void unmarkWordEnd() {
        letters.remove('\0');
    }
    boolean isWordEnd() {
        return letters.containsKey('\0');
    }
}
