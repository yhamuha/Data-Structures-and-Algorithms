package lc.bst.dfs.m;

import lc.bst.TreeNode;

public class CountGoodNodesInBinaryTree {
    // O(n) O(n)
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        int count = 1;
        count += dfs(root.left, root.val);
        count += dfs(root.right, root.val);
        return count;
    }

    public int dfs(TreeNode root, int max) {
        int count = 0;
        if (root == null) return 0;
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        count += dfs(root.left, max);
        count += dfs(root.right, max);
        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        CountGoodNodesInBinaryTree goodNodesFinder = new CountGoodNodesInBinaryTree();
        System.out.println(goodNodesFinder.goodNodes(root));
    }
}
