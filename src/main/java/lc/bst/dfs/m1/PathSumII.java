package lc.bst.dfs.m1;

import lc.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    // O(n); O(n) unbalanced O(log n) balanced
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        dfs(list,sublist,root,targetSum);
        return list;
    }
    public void dfs(List<List<Integer>> list, List<Integer> sublist, TreeNode node, int sum) {
        if(node==null) return;
        sum -= node.val;
        sublist.add(node.val);
        if(sum==0 && node.left==null && node.right==null)
            list.add(new ArrayList<Integer>(sublist));
        dfs(list,sublist,node.left,sum);
        dfs(list,sublist,node.right,sum);
        sublist.remove(sublist.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        PathSumII ps = new PathSumII();
        int targetSum = 22;
        List<List<Integer>> result = ps.pathSum(root, targetSum);
        System.out.println(result);
    }
}
