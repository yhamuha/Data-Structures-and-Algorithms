package lc.bst.dfs.m;

import lc.bst.TreeNode;

public class PathSumIII {
    // O(n^2); O(n) unbalanced O(log n) balanced
    int total = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        dfs(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return total;
    }
    void dfs(TreeNode root, int sum, long curr) {
        if(root == null) return;
        curr += root.val;
        if(curr == sum) total++;
        dfs(root.left, sum, curr);
        dfs(root.right, sum, curr);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.right.right = new TreeNode(11);
        root.left.right.right = new TreeNode(1);
        PathSumIII ps = new PathSumIII();
        int targetSum = 8;
        int result = ps.pathSum(root, targetSum);
        System.out.println(result);
    }
}
