package lc.binarytree.e2;

import lc.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    ArrayList<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        postorder(root);
        return list;
    }
    public void postorder(TreeNode root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }
}
