package lc.bst;

public class PrintBst {
    public static void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }
    public static void printPreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            printInOrder(node.left);
            printInOrder(node.right);
        }
    }
    public static void printPostOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            printInOrder(node.right);
            System.out.print(node.val + " ");
        }
    }
}
