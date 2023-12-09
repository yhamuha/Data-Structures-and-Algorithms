package lc.trie.m;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    class Trie {
        Trie[] child = new Trie[26];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        boolean finish = false;
    }

    private Trie root;
    private PriorityQueue<Trie> pq;
    private List<String> res;
    public List<String> topKFrequent(String[] words, int k) {
        root = new Trie();
        pq = new PriorityQueue<>(new Comparator<Trie>(){ // Sort Trie based on its frequency first
            public int compare(Trie t1, Trie t2){        // and then lexicographical order
                if(t1.count != t2.count){
                    return t2.count - t1.count;
                }
                else
                    return t1.sb.toString().compareTo(t2.sb.toString());
            }
        });
        res = new ArrayList<>();
        for(String word : words){ // build the Trie
            buildTrie(root, word.toCharArray());
        }
        traverse(root); // traverse our Trie and put all Trir node with finished String into pq
        while(k != 0){ // retrieve Trie from pq and save first k
            res.add(pq.poll().sb.toString());
            k--;
        }
        return res;
    }

    public void buildTrie(Trie root, char[] array){
        Trie node = root;
        for(int i = 0; i < array.length; i++){  // insert each character into Trie
            char c = array[i];
            if(node.child[c - 'a'] == null){
                node.child[c - 'a'] = new Trie();
            }
            StringBuilder sb = new StringBuilder();
            if(node.sb.length() != 0){
                sb = node.sb;
            }

            node = node.child[c - 'a'];

            if(node.sb.length() == 0){
                node.sb.append(sb);
                node.sb.append(c);
            }

            if(i == array.length - 1){
                node.count++;
                node.finish = true;
            }
        }
    }

    public void traverse(Trie node){
        for(Trie child : node.child){
            if(child == null){ // skip the current Trie
                continue;
            }
            if(child.finish){ // if current node indicates a finished string
                pq.add(child);
            }
            traverse(child); // continue dfs
        }
    }

    public static void main(String[] args) {
        var tkfw = new TopKFrequentWords();
        String words[] = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(tkfw.topKFrequent(words, k));
    }
}
