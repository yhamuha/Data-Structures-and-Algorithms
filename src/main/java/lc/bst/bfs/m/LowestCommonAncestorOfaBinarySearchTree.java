package lc.bst.bfs.m;

import lc.bst.TreeNode;

public class LowestCommonAncestorOfaBinarySearchTree {
    // O(log n)
    // worst case O(n) if tree unbalanced
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);
        return root;
    }

    public static void main(String[] args) {
        var lca = new LowestCommonAncestorOfaBinarySearchTree();

        TreeNode root = new TreeNode(6,
                // root.left
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                // root.right
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));

        // Create two nodes to find the lowest common ancestor
        TreeNode p = root.left;
        TreeNode q = root.right;

        // Find the lowest common ancestor
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        System.out.println(result.val);
    }
}
