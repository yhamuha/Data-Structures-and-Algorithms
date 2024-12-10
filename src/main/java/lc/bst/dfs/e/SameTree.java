package lc.bst.dfs.e;

import lc.bst.TreeNode;

public class SameTree {
    // O(n) O(n)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) {
            return (p == q);
        }
        return  p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(sameTree.isSameTree(p, q));
    }
}
