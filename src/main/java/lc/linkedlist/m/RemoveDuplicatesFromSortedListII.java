package lc.linkedlist.m;

public class RemoveDuplicatesFromSortedListII {
    // O(n) O(1)
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        ListNode res = dummy;
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val != prev.val && (cur.next == null || cur.val != cur.next.val)) {
                res.next = cur;
                res = res.next;
            }
            prev = cur;
            cur = cur.next;
        }
        res.next = null;
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        RemoveDuplicatesFromSortedListII obj = new RemoveDuplicatesFromSortedListII();
        ListNode result = obj.deleteDuplicates(head);

        printList(result);
    }


}
