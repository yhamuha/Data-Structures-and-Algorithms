package lc.bst.bfs.m;

import lc.bst.TreeNode;
import lc.bst.Pair;

import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
    // O(n log n) O(n)
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.offer(new Pair<>(root, 0));
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        while (!queue.isEmpty()) {
            for (int n = queue.size(); n > 0; --n) {
                var p = queue.pollFirst();
                root = p.getKey();
                int offset = p.getValue();
                map.computeIfAbsent(offset, k -> new ArrayList()).add(root.val);
                if (root.left != null)
                    queue.offer(new Pair<>(root.left, offset - 1));
                if (root.right != null)
                    queue.offer(new Pair<>(root.right, offset + 1));
            }
        }
        return new ArrayList<>(map.values());
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
