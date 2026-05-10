package lc.bst.dfs.e;

import lc.bst.TreeNode;

// O(n); O(log n) or O(n) skewed BST
public class MinimumAbsoluteDifferenceInBST {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root.left != null) dfs(root.left);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        if (root.right != null) dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        MinimumAbsoluteDifferenceInBST solution =
                new MinimumAbsoluteDifferenceInBST();

        System.out.println(solution.getMinimumDifference(root));
    }
}
