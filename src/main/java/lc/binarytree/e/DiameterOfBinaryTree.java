package lc.binarytree.e;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
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
    }
}
