package lc.linkedlist.e;

public class LinkedListCycle {
    // "runner" Floyd's Cycle Detection Algorithm
    // O(n) O(1)
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        var llc = new LinkedListCycle();
        System.out.println(llc.hasCycle(head));
    }
}
