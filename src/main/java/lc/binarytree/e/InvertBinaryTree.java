package lc.binarytree.e;

import lc.binarytree.TreeNode;

public class InvertBinaryTree {
        public TreeNode invertTree(TreeNode root) {
            if(root== null)
                return null;
            TreeNode temp= root.left;
            root.left= root.right;
            root.right= temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }

      public static void printInOrder(TreeNode node) {
          if (node != null) {
              printInOrder(node.left);
              System.out.print(node.val + " ");
              printInOrder(node.right);
          }
      }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
            root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

            InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
            TreeNode invertedRoot = invertBinaryTree.invertTree(root);
            printInOrder(invertedRoot);

        }
}
