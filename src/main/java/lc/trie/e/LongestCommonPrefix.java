package lc.trie.e;

import java.util.ArrayList;
import java.util.List;

    public class LongestCommonPrefix {
        class Node {
            private char value;
            private Node[] children;
            public Node(char val) {
                this.value = val;
                this.children = new Node[26];
            }
        }
        // O(n*m) O(n*m)
        Node root;
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) // O(1)
                return "";
            root = new Node('\0');
            int min = Integer.MAX_VALUE; // O(1)
            List<Integer> list  = new ArrayList<>();
            for(int i = 0; i < strs.length; i++) {
                int count = insert(strs[i], i);
                if(i != 0)
                    min = Math.min(min, count);
            }
            min = Math.min(min, strs[0].length());
            return strs[0].substring(0, min); // O(m)
        }
        public int insert(String word, int n) {
            Node curr = root;
            int count  = 0;
            for(char ch: word.toCharArray()) {
                if(curr.children[ch - 'a'] == null) {
                    if(n != 0)
                        return count;
                    curr.children[ch - 'a'] = new Node(ch);
                } else
                    count++;
                curr = curr.children[ch - 'a'];
            }
            return count;
        }

        public static void main(String[] args) {
            LongestCommonPrefix lcp = new LongestCommonPrefix();
            String[] strs = {"flower", "flow", "flight"};
            String result = lcp.longestCommonPrefix(strs);
            System.out.println(result);
        }
    }


