package misc.m.linkediList;

public class MiddleNode {
    // O(n) O(1)
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        MiddleNode solution = new MiddleNode();
        ListNode middle = solution.middleNode(head);
        System.out.println(middle.val);
    }
}
