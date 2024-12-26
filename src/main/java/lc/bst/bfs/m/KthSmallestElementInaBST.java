package lc.bst.bfs.m;

import lc.bst.TreeNode;
import java.util.*;

public class KthSmallestElementInaBST {
    // O(n log n) O(n)
    static int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int i=0; i<levelSize; i++) {
                TreeNode curr = queue.poll();
                list.add(curr.val);
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4));
        root.left = new TreeNode(1, null, new TreeNode(2));
        root.right = new TreeNode(4, null, null);
        System.out.println(kthSmallest(root,1));
    }
}
