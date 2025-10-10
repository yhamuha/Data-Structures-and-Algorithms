package misc.m.linkediList;

public class ReverseList {
    // O(n) O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, next = null, current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ReverseList solution = new ReverseList();
        ListNode reversed = solution.reverseList(head);
        System.out.print("Reversed list: ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}
