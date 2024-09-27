package lc.bst.dfs.m1;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {
    // O(n); O(n) unbalanced O(log n) balanced
    List<Integer> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        TreeNode node  = root;
        dfs(root);
        if (list.size() == 0)
            return;
        for (int i = 0;i<list.size()-1;i++) {
            root.val = list.get(i);
            root.right = new TreeNode();
            root.left = null;
            root = root.right;
        }
        root.val = list.get(list.size()-1);
        root = node;
    }
    public void dfs(TreeNode root) {
        if (root == null)
            return;
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        FlattenBinaryTreeToLinkedList fbt = new FlattenBinaryTreeToLinkedList();
        fbt.flatten(root);
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}