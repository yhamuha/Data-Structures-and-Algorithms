package lc.binarytree.e1;

import lc.binarytree.BinarySearchTreeFromArray;
import lc.binarytree.TreeNode;

public class SubtreeOfAnotherTree {
    // O(mn)
    // m - root; n - subRoot
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;
        if (helper(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }

    private boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        return (root1 !=null && root2 != null && root1.val == root2.val) &&
                helper(root1.left, root2.left) && helper (root1.right, root2.right);
    }

    public static void main(String[] args) {

        SubtreeOfAnotherTree sat = new SubtreeOfAnotherTree();

        BinarySearchTreeFromArray searchTreeFromArray = new BinarySearchTreeFromArray();
        Integer[] inputArray = {3,4,5,1,2,null,null,null,null,0};
        Integer[] inputArray2 = {4,1,2};
        TreeNode root = searchTreeFromArray.arrayToBST(inputArray);
        TreeNode root2 = searchTreeFromArray.arrayToBST(inputArray2);

        System.out.println(sat.isSubtree(root, root2));
    }
}
