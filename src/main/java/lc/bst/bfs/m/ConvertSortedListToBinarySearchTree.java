package lc.bst.bfs.m;

import lc.bst.ListNode;
import lc.bst.TreeNode;
import lc.bst.PrintBst;
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        // O(n log n) O(1)
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode slow  = head, fast = head.next;
        // find the mid
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9,null)))));
        var csltbst = new ConvertSortedListToBinarySearchTree();
        TreeNode node = csltbst.sortedListToBST(head);
        PrintBst.printInOrder(node);
        System.out.println();
        System.out.println("list had been transformed to BST");

    }
}
