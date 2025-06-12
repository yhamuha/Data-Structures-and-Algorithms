package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator {
    List<Integer> list = new ArrayList<>();
    int index = 0;

    public BinarySearchTreeIterator(TreeNode root) {
        inorder(root);
    }

    // O(1) O(n)
    public int next() {
        return list.get(index++);
    }

    // O(1) O(n)
    public boolean hasNext() {
        return index < list.size();
    }

    // O(n) O(n)
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7, new TreeNode(3), new TreeNode(15));
        root.left = new TreeNode(3, null, null);
        root.right = new TreeNode(15, new TreeNode(9), new TreeNode(20));
        BinarySearchTreeIterator obj = new BinarySearchTreeIterator(root);
        List<Object> output = new ArrayList<>();
        output.add(null);
        output.add(obj.next());
        output.add(obj.next());
        output.add(obj.hasNext());
        output.add(obj.next());
        output.add(obj.hasNext());
        output.add(obj.next());
        output.add(obj.hasNext());
        output.add(obj.next());
        output.add(obj.hasNext());
        System.out.println(output);
    }
}
