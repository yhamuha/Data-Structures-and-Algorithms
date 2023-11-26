package lc.binarytree.e1;

import lc.binarytree.BinarySearchTreeFromArray;
import lc.binarytree.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (height(root) == -1) return false;
        return true;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if (lh == -1 || rh == -1) return -1;
        if (Math.abs (lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);

    }

    public static void main(String[] args) {

        BalancedBinaryTree bbt = new BalancedBinaryTree();

        BinarySearchTreeFromArray searchTreeFromArray = new BinarySearchTreeFromArray();
        Integer[] inputArray = {3, 9, 20, null, null, 15, 7};
        TreeNode root = searchTreeFromArray.arrayToBST(inputArray);

        System.out.println(bbt.isBalanced(root));
    }
}
