package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class SubtreeOfAnotherTree {
    // O(n^2) O(n)
    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;
        if (dfs(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        return (root1 != null && root2 != null && root1.val == root2.val) &&
                dfs(root1.left, root2.left) && dfs(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        System.out.println(isSubtree(root, subRoot));
    }
}
