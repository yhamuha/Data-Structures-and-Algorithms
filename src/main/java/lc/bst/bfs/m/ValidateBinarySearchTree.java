package lc.bst.bfs.m;

import lc.bst.TreeNode;

// https://www.youtube.com/watch?v=gGsEVFP0aQo&ab_channel=NickWhite
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return root == null || isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer lowerLimit, Integer upperLimit) {
        if (node == null) {
            return true;
        }
        if (lowerLimit != null && node.val <= lowerLimit) {
            return false;
        }
        if (upperLimit != null && node.val >= upperLimit) {
            return false;
        }
        return isValid(node.left, lowerLimit, node.val) && isValid(node.right, node.val, upperLimit);
    }

    public static void main(String[] args) {
        var vbst = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(vbst.isValid(root, 1,3));
    }
}
