package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestorOfaBinarySearchTree {
    // O(n); O(n) unbalanced O(log n) balanced
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        while (root != null) {
            if (p.val < root.val && q.val < root.val)
                root = root.left;
            else if (p.val > root.val && q.val > root.val)
                root = root.right;
            else
                return root;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = root.left;
        TreeNode q = root.left.right;
        LowestCommonAncestorOfaBinarySearchTree solution = new LowestCommonAncestorOfaBinarySearchTree();
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
}
