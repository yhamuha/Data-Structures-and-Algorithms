package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class MergeTwoBinaryTrees {
    // O(n) O(n)|(log n) if balanced
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2;
        else if (root2 == null)
            return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    private static void preOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees merger = new MergeTwoBinaryTrees();
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode mergedRoot = merger.mergeTrees(root1, root2);
        preOrderTraversal(mergedRoot);
    }
}
