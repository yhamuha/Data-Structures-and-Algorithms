package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestorOfaBinarySearchTree {
    // O(n) O(n)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if ((p.val < current.val && q.val > current.val) ||
                    (p.val > current.val && q.val < current.val))
                return current;
            if (p.val < current.val && q.val < current.val) {
                if (current.left != null)
                    queue.add(current.left);
            } else if (p.val > current.val && q.val > current.val) {
                if (current.right != null)
                    queue.add(current.right);
            } else if (current.val == p.val || current.val == q.val)
                return current;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = root.left;
        TreeNode q = root.left.right;
        LowestCommonAncestorOfaBinarySearchTree solution = new LowestCommonAncestorOfaBinarySearchTree();
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
}
