package lc.bst.dfs.m;

import lc.bst.TreeNode;

public class LowestCommonAncestorOfaBinaryTree {
    // O(n); O(n) unbalanced O(log n) balanced
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p) return p;
        if (root == q ) return q;
        TreeNode lef = lowestCommonAncestor(root.left,p,q);
        TreeNode rig = lowestCommonAncestor(root.right,p,q);
        if (lef == null)
            return rig;
        if (rig == null)
            return lef;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        LowestCommonAncestorOfaBinaryTree lcaFinder = new LowestCommonAncestorOfaBinaryTree();
        TreeNode lca = lcaFinder.lowestCommonAncestor(root, root.left, root.right);
        System.out.println("LCA of 5 and 1: " + (lca != null ? lca.val : "null"));
        lca = lcaFinder.lowestCommonAncestor(root, root.left, root.left.right.right);
        System.out.println("LCA of 5 and 4: " + (lca != null ? lca.val : "null"));
        lca = lcaFinder.lowestCommonAncestor(root, root.left.left, root.left.right.left);
        System.out.println("LCA of 6 and 7: " + (lca != null ? lca.val : "null"));
    }

}
