package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    // O(n); O(n) | O(log n)
    public int sumRootToLeaf(TreeNode root) {
        if (root == null)
            return 0;
        return sum(root, 0);
    }

    public int sum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum = (sum << 1) + root.val;
        if (root.left == null && root.right == null)
            return sum;
        return sum(root.left, sum) + sum(root.right, sum);
    }

    public static void main(String[] args) {
        SumOfRootToLeafBinaryNumbers solution = new SumOfRootToLeafBinaryNumbers();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        System.out.println(solution.sumRootToLeaf(root));
    }
}
