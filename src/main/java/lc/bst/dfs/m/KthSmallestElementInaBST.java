package lc.bst.dfs.m;

import lc.bst.TreeNode;

public class KthSmallestElementInaBST {
    //O(n) O(n)
    int count = 0, ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null) return;
        dfs(root.left, k);
        count++;
        if (count == k) {
            ans = root.val;
            return;
        }
        dfs(root.right, k);
    }

    public static void main(String[] args) {
        KthSmallestElementInaBST kseb = new KthSmallestElementInaBST();
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4));
        root.left = new TreeNode(1, null, new TreeNode(2));
        root.right = new TreeNode(4, null, null);
        System.out.println(kseb.kthSmallest(root, 1));
    }
}
