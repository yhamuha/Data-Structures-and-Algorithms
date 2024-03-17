package lc.bst.dfs.e2;

import lc.bst.TreeNode;

public class MergeTwoBinaryTrees {
    // preorder-dfs
    // O(n) O(n)
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null)
            return root2;
        else if(root2 == null)
            return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees merger = new MergeTwoBinaryTrees();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);
        TreeNode mergedRoot = merger.mergeTrees(root1, root2);
        System.out.println("Merged Tree:");
        printPreorder(mergedRoot);
    }

    private static void printPreorder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(node.val + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

}
