package lc.bst.dfs.m1;

import lc.bst.TreeNode;

public class CountUnivalueSubtrees {
    // O(n); O(n) unbalanced O(log n) balanced
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null)
            return 0;
        int[] count = {0};
        helper(root, count, root.val);
        return count[0];
    }
    private boolean helper(TreeNode root, int[] count, int val) {
        if (root == null)
            return true;
        if (!helper(root.left, count, root.val) | !helper(root.right, count, root.val))
            return false;
        count[0]++;
        return root.val == val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(5);
        CountUnivalueSubtrees counter = new CountUnivalueSubtrees();
        int result = counter.countUnivalSubtrees(root);
        System.out.println(result);
    }
}
