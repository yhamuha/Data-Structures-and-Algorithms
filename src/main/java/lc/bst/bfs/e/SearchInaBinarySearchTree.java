package lc.bst.bfs.e;

import lc.bst.PrintBst;
import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInaBinarySearchTree {
    // O(n) O(n)
    static TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.val == val)
                return temp;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return null;
    }
    // O(n) O(1)
    static TreeNode searchBST_opt(TreeNode root, int val){
        while (root!=null) {
            if (root.val>val)
                root=root.left;
            else if (root.val<val)
                root=root.right;
            else
                return root;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, null, null);
        // TreeNode searched = searchBST(root,2);
        TreeNode searched = searchBST_opt(root,2);
        PrintBst.printPreOrder(searched);
    }
}
