package lc.bst.bfs.e;

import lc.bst.PrintBst;
import lc.bst.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SearchInaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while(!deque.isEmpty()) {
            TreeNode temp = deque.remove();
            if(temp.val == val)
                return temp;
            if (temp.left != null)
                deque.add(temp.left);
            if (temp.right != null)
                deque.add(temp.right);
        }

        return null;
    }

    public static void main(String[] args) {
        var sbst = new SearchInaBinarySearchTree();
        TreeNode root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, null, null);
        TreeNode searched = sbst.searchBST(root,2);
        PrintBst.printInOrder(searched);
    }
}
