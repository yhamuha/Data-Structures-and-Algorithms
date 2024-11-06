package lc.bst.dfs.m;

import lc.bst.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // O(n^2); O(n) unbalanced O(log n) balanced
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeDfs(0,0,inorder.length-1,preorder, inorder);
    }
    private TreeNode buildTreeDfs(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart>=preorder.length || inStart>inEnd)
            return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        int mid = 0;
        for(int i=inStart;i<inorder.length;i++){
            if(inorder[i]==node.val){
                mid=i;
                break;
            }
        }
        node.left = buildTreeDfs(preStart+1, inStart,mid-1,preorder,inorder);
        node.right = buildTreeDfs(preStart+mid-inStart+1, mid+1,inEnd,preorder,inorder);
        return node;
    }
    public void printPreOrder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = builder.buildTree(preorder, inorder);
        builder.printPreOrder(root);
    }
}
