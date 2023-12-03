package lc.bst.bfs.m;

import lc.bst.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0)
                    result.add(node.val);
                if (node.right != null)
                    queue.add(node.right);
                if (node.left != null)
                    queue.add(node.left);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        BinaryTreeRightSideView btrsv = new BinaryTreeRightSideView();

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left = new TreeNode(2, null, new TreeNode(5));
        root.right = new TreeNode(3, null, new TreeNode (4));

        System.out.println(btrsv.rightSideView(root));
    }
}
