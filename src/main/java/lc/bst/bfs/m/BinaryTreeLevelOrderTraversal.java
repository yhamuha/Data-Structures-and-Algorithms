package lc.bst.bfs.m;

import com.sun.source.tree.Tree;
import lc.bst.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new LinkedList<>();
        if (root == null) return answer;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                l.add(temp.val);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
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
