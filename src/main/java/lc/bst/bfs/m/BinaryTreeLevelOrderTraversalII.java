package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
    // O(n) O(n)
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Stack<List<Integer>> levels = new Stack<>();
        if(root != null)
            nodeQueue.offer(root);
        while(!nodeQueue.isEmpty()) {
            int qSize = nodeQueue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                TreeNode curr = nodeQueue.poll();
                level.add(curr.val);
                if(curr.left != null) nodeQueue.offer(curr.left);
                if(curr.right != null) nodeQueue.offer(curr.right);
            }
            levels.push(level);
        }
        List<List<Integer>> res = new ArrayList<>();
        while(!levels.isEmpty())
            res.add(levels.pop());
        return res;
    }

    public static void main(String[] args) {
        var btlotII = new BinaryTreeLevelOrderTraversalII();
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode (7));
        System.out.println(btlotII.levelOrderBottom(root));
    }
}
