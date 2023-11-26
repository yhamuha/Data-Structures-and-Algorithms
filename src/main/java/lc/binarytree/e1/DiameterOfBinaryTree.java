package lc.binarytree.e1;

import lc.binarytree.TreeNode;

public class DiameterOfBinaryTree {
    /*public int diameterOfBinaryTree(TreeNode root) {
        // SC O(1)
        int[] ans = new int[1];
        height(root, ans);
        return ans[0];
    }

    private int height(TreeNode node, int[] ans) {
        if (node == null) return 0;
        // SC O(n) ; call stack
        int lh = height(node.left, ans);
        int rh = height(node.right, ans);
        ans[0] = Math.max(ans[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }*/
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
