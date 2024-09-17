package lc.bst.dfs.e1;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    // O(n), O(log n) balanced O(n) unbalanced
    public void traversal(TreeNode root, List<Integer> res){
        if(root==null) return;
        traversal(root.left, res);
        traversal(root.right, res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        BinaryTreePostorderTraversal btp = new BinaryTreePostorderTraversal();
        List<Integer> result = btp.postorderTraversal(root);
        System.out.println(result);
    }
}
