package lc.bst.bfs.m;

import lc.bst.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    // O(n) O(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<>();
        if (root == null) return answer;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                l.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            answer.add(l);
        }
        return answer;
    }

    public static void main(String[] args) {
        var btlot = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode (7));
        List<List<Integer>> traversed = btlot.levelOrder(root);
        System.out.println(traversed);
    }
}
