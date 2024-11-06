package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class BalancedBinaryTree {
    // O(n), O(n) - unbalanced O(log n) - balanced
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (height(root) == -1) return false;
        return true;
    }
    private int height(TreeNode root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if (lh == -1 || rh == -1) return -1;
        if (Math.abs (lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);

    }

    public static void main(String[] args) {
        BalancedBinaryTree bbt = new BalancedBinaryTree();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(bbt.isBalanced(root));
    }
}
