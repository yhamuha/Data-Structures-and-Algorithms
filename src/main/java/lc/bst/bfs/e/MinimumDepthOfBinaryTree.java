package lc.bst.bfs.e;

import lc.bst.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int depth=1;

        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- >0)
            {
                root = q.poll();
                if(root.left == null && root.right == null)
                    return depth;
                if(root.left!=null)
                    q.add(root.left);
                if(root.right != null)
                    q.add(root.right);
            }
            depth++;
        }
        return 0;

    }

    public static void main(String[] args) {
        var mdobt = new MinimumDepthOfBinaryTree();

       /* TreeNode root = new TreeNode(2, null,
                            new TreeNode(3, null,
                                    new TreeNode(4, null,
                                            new TreeNode(5, null,
                                                    new TreeNode(6)))));*/
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        root.left = new TreeNode(9, null, null);
        root.right = new TreeNode(20, new TreeNode(18), new TreeNode(7));

        System.out.println(mdobt.minDepth(root));
    }
}
