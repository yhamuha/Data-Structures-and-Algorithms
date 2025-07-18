package lc.bst.bfs.m;

import lc.bst.TreeNode;
import lc.bst.Pair;

import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
    // O(n log n) O(n)
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<Pair<TreeNode, Integer>> q = new ArrayDeque<>();
        q.offer(new Pair<>(root, 0));
        TreeMap<Integer, List<Integer>> d = new TreeMap<>();
        while (!q.isEmpty()) {
            for (int n = q.size(); n > 0; --n) {
                var p = q.pollFirst();
                root = p.getKey();
                int offset = p.getValue();
                d.computeIfAbsent(offset, k -> new ArrayList()).add(root.val);
                if (root.left != null) {
                    q.offer(new Pair<>(root.left, offset - 1));
                }
                if (root.right != null) {
                    q.offer(new Pair<>(root.right, offset + 1));
                }
            }
        }
        return new ArrayList<>(d.values());
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        BinaryTreeVerticalOrderTraversal traversal = new BinaryTreeVerticalOrderTraversal();
        List<List<Integer>> result = traversal.verticalOrder(root);
        for (List<Integer> level : result)
            System.out.println(level);
    }
}
