package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    // O(n) O(n)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<>();
        if (root == null) return answer;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (queue.size() > 0) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                if (flag) list.addLast(temp.val);
                else list.addFirst(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            answer.add(list);
            flag = !flag;
        }
        return answer;
    }

    public static void main(String[] args) {
        var btzlot = new BinaryTreeZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println(btzlot.zigzagLevelOrder(root));
    }
}
