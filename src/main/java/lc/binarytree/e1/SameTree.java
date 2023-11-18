package lc.binarytree.e1;

import lc.binarytree.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null || q == null) {
            return (p == q); // true
        }

        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
