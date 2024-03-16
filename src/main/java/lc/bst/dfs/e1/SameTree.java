package lc.bst.dfs.e1;

import lc.bst.TreeNode;

public class SameTree {
    // O(n) O(n)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) {
            return (p == q); // true
        }
        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(sameTree.isSameTree(p, q));
    }
}
