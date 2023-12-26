package lc.trie.m;

import java.util.HashMap;

class Node {
    HashMap<Character, Node> children;
    boolean isEnd;
    Node() {
        this.children = new HashMap<>();
        this.isEnd = false;
    }
}
// O(n*m) n - number of words; m - length of word
class DesignAddAndSearchWordsDataStructure {

    private Node root;

    public DesignAddAndSearchWordsDataStructure() {
        this.root = new Node();
    }

    public void addWord(String word) {
        Node curr = this.root;

        for(char ch : word.toCharArray()) {
            if(!curr.children.containsKey(ch))
                curr.children.put(ch, new Node());
            curr = curr.children.get(ch);
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        return search(word, this.root, 0);
    }

    private boolean search(String word, Node curr, int index) {

        for(int i=index;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ch == '.') {
                // look for the word ahead
                for(char c : curr.children.keySet()) {
                    Node trieNode = curr.children.get(c);
                    if(search(word, trieNode, i+1))
                        return true;
                }
                return false;
            } else {
                if(!curr.children.containsKey(ch))
                    return false;
                curr = curr.children.get(ch);
            }
        }
        return curr.isEnd;
    }

    public static void main(String[] args) {
        var daaswds = new DesignAddAndSearchWordsDataStructure();

        daaswds.addWord("bad");
        daaswds.addWord("dad");
        daaswds.addWord("mad");

        System.out.println(daaswds.search("pad")); // false
        System.out.println(daaswds.search("bad")); // true
        System.out.println(daaswds.search(".ad")); // true
        System.out.println(daaswds.search("b..")); // true
    }
}


