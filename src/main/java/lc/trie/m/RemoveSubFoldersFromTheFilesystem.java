package lc.trie.m;

import java.util.ArrayList;
import java.util.List;

class RemoveSubFoldersFromTheFilesystem {
    //O(n*m) O(n*m)
    class TrieNode {
        char data;
        TrieNode children[];
        boolean isTerminal;
        public TrieNode (char ch) {
            data = ch;
            children = new TrieNode[27];
        }
    }
    private TrieNode root;
    public RemoveSubFoldersFromTheFilesystem () {
        root = new TrieNode('*');
    }
    public void insertWord (String word) {
        insertWordUtil (this.root , word);
    }
    private void insertWordUtil (TrieNode Root , String word) {
        if (word.length() == 0) {
            Root.isTerminal = true;
            return;
        }
        char ch = word.charAt(0);
        int idx = ch == '/' ? 26 : ch - 'a';
        TrieNode child = null;
        if (Root.children[idx] != null) {
            child = Root.children[idx];
        } else {
            child = new TrieNode(ch);
            Root.children[idx] = child;
        }
        insertWordUtil (child , word.substring(1));
    }
    public List<String> getRootFolders () { // O(n*m)
        List<String> ans = new ArrayList<>();
        getRootFoldersUtil (this.root , ans , "");
        return ans;
    }
    private void getRootFoldersUtil (TrieNode Root , List<String> ans , String path) {
        if (Root.isTerminal) {
            ans.add (path);
            Root.isTerminal = false;
            completePath (Root , path , ans);
            Root.isTerminal = true;
            return;
        }
        for (int i = 0 ; i < 27 ; i++) {
            char ch = i == 26 ? '/' : (char)(i + 97);
            if (Root.children[i] != null)
                getRootFoldersUtil (Root.children[i] , ans , path + ch);
             else
                continue;
        }
    }
    private void completePath (TrieNode Root , String path , List<String> ans) {
        if (Root.isTerminal)
            ans.add(path);
        for (int i = 0; i < 27; i++) {
            if (i == 26)
                return;
            if (Root.children[i] != null) {
                char ch = (char) (i + 97);
                completePath(Root.children[i], path + ch, ans); // O(n*m)
            } else
                continue;
        }
    }
}

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        var rsfftf  = new RemoveSubFoldersFromTheFilesystem ();
        for (String folders : folder)  // O(n*m)
            rsfftf.insertWord (folders);
        List<String> rootFolders = rsfftf.getRootFolders();
        return rootFolders;
    }
    public static void main(String[] args) {
        var solution = new Solution();
        String[] folders = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(solution.removeSubfolders(folders));
    }
}


