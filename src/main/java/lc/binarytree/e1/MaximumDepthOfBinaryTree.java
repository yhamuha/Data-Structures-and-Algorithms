package lc.binarytree.e1;

import lc.binarytree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        MaximumDepthOfBinaryTree maxDepth = new MaximumDepthOfBinaryTree();
        System.out.println(maxDepth.maxDepth(root));
    }
}
