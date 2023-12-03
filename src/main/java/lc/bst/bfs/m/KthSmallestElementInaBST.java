package lc.bst.bfs.m;

import lc.bst.TreeNode;

import java.util.*;

public class KthSmallestElementInaBST {

    //                  use PriorityQueue to have O(log n + m) TC
    //
    //                  pq.push(node->val);
    //                  if (pq.size() > k) {
    //                        pq.pop();
    //                  }
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int lvlSize = q.size();
            for(int i=0;i<lvlSize;i++)
            {
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        Collections.sort(l);
        return l.get(k-1);
    }
    public static void main(String[] args) {
        var kse = new KthSmallestElementInaBST();

        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4));
        root.left = new TreeNode(1, null, new TreeNode(2));
        root.right = new TreeNode(4, null, null);

        System.out.println(kse.kthSmallest(root,1));
    }
}
