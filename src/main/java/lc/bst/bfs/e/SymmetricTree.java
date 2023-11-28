package lc.bst.bfs.e;

import lc.bst.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return check(root.left, root.right);
    }

    boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;

        if (l == null || r == null || l.val != r.val) return false;

        return check(l.left, r.right) && check(l.right, r.left);
    }

    public static void main(String[] args) {
        var st = new SymmetricTree();

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));

        /*TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        root.left = new TreeNode(2, null, new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(3));*/

        System.out.println(st.isSymmetric(root));
    }
}
