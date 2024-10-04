package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.Stack;
public class ValidateBinarySearchTree {
    // O(n); O(n) unbalanced O(log n) balanced
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int left_child_val = - Integer.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= left_child_val) return false;
            left_child_val = root.val;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {
        var vbst = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(vbst.isValidBST(root));
    }
}
