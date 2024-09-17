package lc.bst.dfs.e1;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    // O(n*h) O(n*h)
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,null,new TreeNode(5)), new TreeNode(3));
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        List<String> paths = binaryTreePaths.binaryTreePaths(root);
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
