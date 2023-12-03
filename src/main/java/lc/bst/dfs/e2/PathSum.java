package lc.bst.dfs.e2;

import lc.bst.TreeNode;

public class PathSum {
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
}