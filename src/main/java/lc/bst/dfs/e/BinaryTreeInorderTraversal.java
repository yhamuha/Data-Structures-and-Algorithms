package lc.bst.dfs.e;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    // O(n), O(log n) balanced O(n) unbalanced
    public void traversal(TreeNode root , List<Integer> res ){
        if(root==null) return;
        traversal(root.left,res);
        res.add(root.val);
        traversal(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        traversal(root,res);
        return(res);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        BinaryTreeInorderTraversal bti = new BinaryTreeInorderTraversal();
        List<Integer> result = bti.inorderTraversal(root);
        System.out.println(result);
    }
}
