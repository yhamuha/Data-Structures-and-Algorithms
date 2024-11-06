package lc.bst.dfs.e;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {
    // O(n) O(n)
    public int minDiffInBST(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        inOrderTraversal(root, list);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<list.size()-1; i++){
            min= Math.min(min, list.get(i+1)-list.get(i));
        }
        return min;

    }
    public void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(new MinimumDistanceBetweenBSTNodes().minDiffInBST(root));
    }
}
