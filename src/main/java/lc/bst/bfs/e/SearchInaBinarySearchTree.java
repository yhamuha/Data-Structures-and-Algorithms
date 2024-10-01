package lc.bst.bfs.e;

import lc.bst.PrintBst;
import lc.bst.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SearchInaBinarySearchTree {
    // O(n) O(n)
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if(temp.val == val)
                return temp;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return null;
    }

    public static void main(String[] args) {
        var sbst = new SearchInaBinarySearchTree();
        TreeNode root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, null, null);
        TreeNode searched = sbst.searchBST(root,2);
        PrintBst.printPreOrder(searched);
    }
}
