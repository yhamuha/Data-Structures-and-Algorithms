package lc.bst.dfs.e1;

import lc.bst.TreeNode;

public class PathSum {
    // O(n), O(n) unbalanced O(log n) balanced
    public boolean rootToLeafPathSum(TreeNode root, int targetSum, int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            sum = sum + root.val;
            if(sum == targetSum)
                return true;
        }
        return rootToLeafPathSum(root.left, targetSum, sum + root.val)
                || rootToLeafPathSum(root.right, targetSum, sum + root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootToLeafPathSum(root, targetSum, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        var ps = new PathSum();
        System.out.println(ps.hasPathSum(root, targetSum));
    }
}
