package lc.binarytree.m2;

import lc.binarytree.TreeNode;

public class CountUnivalueSubtrees {
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] count = {0};
        helper(root, count, root.val);
        return count[0];
    }

    private boolean helper(TreeNode root, int[] count, int val) {
        if (root == null) {
            return true;
        }
        if (!helper(root.left, count, root.val) | !helper(root.right, count, root.val)) {
            return false;
        }
        count[0]++;
        return root.val == val;
    }
}
