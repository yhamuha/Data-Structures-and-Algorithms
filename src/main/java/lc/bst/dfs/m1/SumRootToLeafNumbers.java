package lc.bst.dfs.m1;

import lc.bst.TreeNode;

public class SumRootToLeafNumbers {
    // O(n); O(n) unbalanced O(log n) balanced
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        int[] sum = {0};
        dfs(root, 0, sum);
        return sum[0];

    }
    private static void dfs(TreeNode root, int currentSum, int[] sum) {
        if (root == null)
            return;
        currentSum = currentSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum[0] += currentSum;
            return;
        }
        dfs(root.left, currentSum, sum);
        dfs(root.right, currentSum, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        SumRootToLeafNumbers sn = new SumRootToLeafNumbers();
        System.out.println(sn.sumNumbers(root));
    }
}
