package lc.bst.bfs.m;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedListToBinarySearchTree {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Node {
        ListNode head, slow, tail;
        TreeNode tree;

        Node(ListNode head, ListNode slow, ListNode tail, TreeNode tree) {
            this.head = head;
            this.slow = slow;
            this.tail = tail;
            this.tree = tree;
        }
    }

    // O(n log n) O(n)
    public TreeNode sortedListToBST(ListNode head) {
        ListNode slow = head, fast = head, tail = null;
        if (head == null)
            return null;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        Node node = new Node(head, slow, tail, root);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.head != curr.slow) {
                head = curr.head;
                tail = curr.slow;
                slow = head;
                fast = head;
                while (fast != tail && fast.next != tail) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                TreeNode left = new TreeNode(slow.val);
                curr.tree.left = left;
                queue.add(new Node(curr.head, slow, curr.slow, left));
            }
            if (curr.tail != curr.slow.next) {
                head = curr.slow.next;
                tail = curr.tail;
                slow = head;
                fast = head;
                while (fast != tail && fast.next != tail) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                TreeNode right = new TreeNode(slow.val);
                curr.tree.right = right;
                queue.add(new Node(curr.slow.next, slow, curr.tail, right));
            }
        }
        return root;
    }

    public void printPreOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    public static void main(String[] args) {
        ConvertSortedListToBinarySearchTree csltbst = new ConvertSortedListToBinarySearchTree();
        ListNode head = csltbst.new ListNode(-10,
                csltbst.new ListNode(-3,
                        csltbst.new ListNode(0,
                                csltbst.new ListNode(5,
                                        csltbst.new ListNode(9, null)))));
        TreeNode root = csltbst.sortedListToBST(head);
        csltbst.printPreOrder(root);
    }
}



