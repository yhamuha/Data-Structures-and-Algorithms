package lc.bst.dfs.m;

import lc.bst.TreeNode;

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    // O(n); O(n) unbalanced O(log n) balanced
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return dfs(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }
    public TreeNode dfs(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd,
                        HashMap<Integer, Integer> map) {
        if (inStart > inEnd || postStart > postEnd)
            return null;
        TreeNode root = new TreeNode(postOrder[postEnd]);
        int inIndex = map.get(root.val);
        int leftTreeSize = inIndex - inStart;
        root.left = dfs(inOrder, inStart, inIndex - 1, postOrder, postStart, postStart + leftTreeSize - 1, map);
        root.right = dfs(inOrder, inIndex + 1, inEnd, postOrder, postStart + leftTreeSize, postEnd - 1, map);
        return root;
    }
    public static void printPreorder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderAndPostorderTraversal builder =
                new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = builder.buildTree(inorder, postorder);
        printPreorder(root);
    }
}