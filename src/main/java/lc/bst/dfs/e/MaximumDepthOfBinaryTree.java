package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class MaximumDepthOfBinaryTree {
    // O(n) O(n)
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        var md = new MaximumDepthOfBinaryTree();
        System.out.println(md.maxDepth(root));
    }
}
