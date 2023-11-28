package lc.bst.dfs.e2;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    ArrayList<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String ans="";
        path(root,ans);
        return list;
    }
    void path(TreeNode root, String ans) {
        if(root==null) return;
        ans=ans+root.val;
        if(root.left==null && root.right==null){
            list.add(ans);
            return;
        }
        ans=ans+"->";
        path(root.left,ans);
        path(root.right,ans);
    }
}
