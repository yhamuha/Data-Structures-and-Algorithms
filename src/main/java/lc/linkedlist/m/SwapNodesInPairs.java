package lc.linkedlist.m;

public class SwapNodesInPairs {
    // O(n) O(1)
    static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode curr = head.next.next;
        ListNode prev = head;
        head = head.next;
        head.next = prev;
        while (curr != null && curr.next != null) {
            prev.next = curr.next;
            prev = curr;
            ListNode temp = curr.next.next;
            curr.next.next = curr;
            curr = temp;
        }
        prev.next = curr;
        return head;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        printList(swapPairs(head));
    }
}
