package lc.bst.bfs.e;

import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    // O(n) O(n)
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if (t1 == null && t2 == null)
                continue;
            if (t1 == null || t2 == null)
                return false;
            if (t1.val != t2.val)
                return false;
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }

    public static void main(String[] args) {
        var st = new SymmetricTree();
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        System.out.println(st.isSymmetric(root));
    }
}
