package lc.linkedlist.m;

public class RotateList {
    // O(n) O(1)
    static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        temp.next = head;
        k = k % count;
        int upto = count - k;
        temp = head;
        for (int i = 1; i < upto; i++)
            temp = temp.next;
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        printList(rotateRight(head, k));
    }
}
