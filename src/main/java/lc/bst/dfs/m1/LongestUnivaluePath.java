package lc.bst.dfs.m1;

import lc.bst.TreeNode;

public class LongestUnivaluePath {
    // O(n); O(n) unbalanced O(log n) balanced
    private int longest = 0;
    public int longestUnivaluePath(TreeNode root) {
        postorderDFS(root);
        return longest;
    }
    private int postorderDFS(TreeNode root) {
        if (root == null) return 0;
        int l = postorderDFS(root.left);
        int r = postorderDFS(root.right);
        int ltotal = 0;
        int rtotal = 0;
        if (root.left != null && root.left.val == root.val) ltotal = l + 1;
        if (root.right != null && root.right.val == root.val) rtotal = r + 1;
        longest = Math.max(longest, ltotal + rtotal);
        return Math.max(ltotal, rtotal);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(5);
        LongestUnivaluePath solution = new LongestUnivaluePath();
        int result = solution.longestUnivaluePath(root);
        System.out.println(result);
    }
}
