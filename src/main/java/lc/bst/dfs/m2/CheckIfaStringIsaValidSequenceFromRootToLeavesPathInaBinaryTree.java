package lc.bst.dfs.m2;

import lc.bst.TreeNode;

public class CheckIfaStringIsaValidSequenceFromRootToLeavesPathInaBinaryTree {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root, arr, 0);
    }

    private boolean dfs(TreeNode root, int[] arr, int i) {
        if (root == null || i == arr.length || root.val != arr[i]) {
            return false;
        }
        if (i == arr.length - 1) {
            return root.left == null && root.right == null;
        }
        return dfs(root.left, arr, i+1) || dfs(root.right, arr, i+1);
    }
}
