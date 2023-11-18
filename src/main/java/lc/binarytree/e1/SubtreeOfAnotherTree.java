package lc.binarytree.e1;

import lc.binarytree.TreeNode;

public class SubtreeOfAnotherTree {
    // O(mn)
    // m - root; n - subRoot
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(subRoot == null) return true;
        if(root == null) return false;
        if(helper(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public boolean helper(TreeNode root1, TreeNode root2)
    {
        if(root1 == null && root2 == null)
            return true;
        return (root1 != null && root2 != null && root1.val == root2.val) &&
                helper(root1.left , root2.left) && helper(root1.right , root2.right);
    }
}
