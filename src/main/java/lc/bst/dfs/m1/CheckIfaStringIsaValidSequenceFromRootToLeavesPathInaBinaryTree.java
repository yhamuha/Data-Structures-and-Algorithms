package lc.bst.dfs.m1;

import lc.bst.TreeNode;

public class CheckIfaStringIsaValidSequenceFromRootToLeavesPathInaBinaryTree {
    // O(n); O(n) unbalanced O(log n) balanced
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root, arr, 0);
    }
    private boolean dfs(TreeNode root, int[] arr, int i) {
        if (root == null || i == arr.length || root.val != arr[i])
            return false;
        if (i == arr.length - 1)
            return root.left == null && root.right == null;
        return dfs(root.left, arr, i+1) || dfs(root.right, arr, i+1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(0);
        root.right.right = new TreeNode(0);
        int[] sequence1 = {0, 1, 0}; int[] sequence2 = {0, 1, 1}; int[] sequence3 = {0, 0, 0};
        CheckIfaStringIsaValidSequenceFromRootToLeavesPathInaBinaryTree solution =
                new CheckIfaStringIsaValidSequenceFromRootToLeavesPathInaBinaryTree();
        boolean result1 = solution.isValidSequence(root, sequence1);
        System.out.println(java.util.Arrays.toString(sequence1) + " " + result1);
        boolean result2 = solution.isValidSequence(root, sequence2);
        System.out.println(java.util.Arrays.toString(sequence2) + " " + result2);
        boolean result3 = solution.isValidSequence(root, sequence3);
        System.out.println(java.util.Arrays.toString(sequence3) + " " + result3);
    }
}
