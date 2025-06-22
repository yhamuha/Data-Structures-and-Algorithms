package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class RangeSumOfBST {
    // O(n) O(n)
    static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        if (root.val >= low && root.val <= high)
            return rangeSumBST(root.left, low, high)
                    + root.val + rangeSumBST(root.right, low, high);
        else if (root.val > high)
            return rangeSumBST(root.left, low, high);
        else
            return rangeSumBST(root.right, low, high);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        int low = 7, high = 15;
        System.out.println(rangeSumBST(root, low, high));
    }
}
