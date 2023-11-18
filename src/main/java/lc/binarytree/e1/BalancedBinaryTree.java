package lc.binarytree.e1;

import lc.binarytree.BinarySearchTreeFromArray;
import lc.binarytree.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)  return true;
        if (height(root) == -1)  return false;
        return true;
    }
    public int height(TreeNode root) {
        if (root == null)  return 0;
        int leftHeight = height(root.left);
        int rightHight = height(root.right);
        if (leftHeight == -1 || rightHight == -1)  return -1;
        if (Math.abs(leftHeight - rightHight) > 1)  return -1;
        return Math.max(leftHeight, rightHight) + 1;
    }

    public static void main(String[] args) {

        BalancedBinaryTree bbt = new BalancedBinaryTree();

        BinarySearchTreeFromArray searchTreeFromArray = new BinarySearchTreeFromArray();
        Integer[] inputArray = {3, 9, 20, null, null, 15, 7};
        TreeNode root = searchTreeFromArray.arrayToBST(inputArray);

        System.out.println(bbt.isBalanced(root));
    }
}
