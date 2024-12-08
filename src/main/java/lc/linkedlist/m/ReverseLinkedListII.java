package lc.linkedlist.m;

public class ReverseLinkedListII {
    // O(n) O(1)
    static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        for (int i = 1; i < left; i++)
            prev = prev.next;
        ListNode reverseStart = prev.next;
        ListNode curr = reverseStart.next;
        for (int i = 0; i < right - left; i++) {
            reverseStart.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = reverseStart.next;
        }
        return dummy.next;
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(reverseBetween(head, 2, 4));
    }
}
