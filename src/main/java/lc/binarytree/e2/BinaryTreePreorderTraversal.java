package lc.binarytree.e2;

import lc.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public void traversal(TreeNode root, List<Integer> res) {

        // Return if the current node is null
        // base case
        if (root == null) return;

        // Add the current node's value to the result list
        res.add(root.val);

        // Recursively traverse the left and right subtrees
        traversal(root.left, res);
        traversal(root.right, res);
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        // Creating a list to store the traversal result
        // Initialization
        List<Integer> res = new ArrayList<>();

        // To perform the traversal
        traversal(root, res);

        // Return the result
        return res;
    }
}
