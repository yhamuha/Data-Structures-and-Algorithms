package lc.bst.bfs.e;

import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    // O(n) O(n)
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resultList = new LinkedList<>();
        if (root == null) return resultList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        double sum = 0;
        while (!queue.isEmpty()) {
            sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            double avg = sum / size;
            resultList.add(avg);
        }
        return resultList;
    }

    public static void main(String[] args) {
        AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution.averageOfLevels(root));
    }
}
