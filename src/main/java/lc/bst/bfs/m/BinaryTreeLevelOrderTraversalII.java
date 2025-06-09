package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
    // O(n) O(n)
    static List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root != null)
            queue.offer(root);
        while (!queue.isEmpty()) {
            int qSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            stack.push(level);
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!stack.isEmpty())
            res.add(stack.pop());
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println(levelOrderBottom(root));
    }
}
