package lc.bst.dfs.e1;

import lc.bst.TreeNode;

public class DiameterOfBinaryTree {
    // O(n), O(n)-skewed O(log n) - balanced
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        height(root, ans);
        return ans[0];
    }
    private int height(TreeNode root, int[] ans) {
        if (root == null)
            return 0;
        int lh = height(root.left, ans);
        int rh = height(root.right, ans);
        ans[0] = Math.max(ans[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3, null, null);
        DiameterOfBinaryTree dobt = new DiameterOfBinaryTree();
        int diameter = dobt.diameterOfBinaryTree(root);
        System.out.println(diameter);
    }
}
