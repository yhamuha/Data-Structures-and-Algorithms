package lc.bst.dfs.e1;

import lc.bst.TreeNode;

public class SubtreeOfAnotherTree {
    // O(m * n) O(n)
    // m - root; n - subRoot
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;
        if (helper(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }
    // O(m) O(n)
    private boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        return (root1 !=null && root2 != null && root1.val == root2.val) &&
                helper(root1.left, root2.left) && helper (root1.right, root2.right);
    }
    public static void main(String[] args) {
        SubtreeOfAnotherTree checker = new SubtreeOfAnotherTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        System.out.println(checker.isSubtree(root, subRoot));
    }
}
