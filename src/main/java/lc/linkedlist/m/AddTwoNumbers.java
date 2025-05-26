package lc.linkedlist.m;

public class AddTwoNumbers {
    // O(n) O(n)
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode n = new ListNode(0);
        int carry = 0;
        ListNode dummy = n;
        while (a != null || b != null) {
            int x = a != null ? a.val : 0;
            int y = b != null ? b.val : 0;
            int k = x + y + carry;
            carry = k / 10;
            dummy.next = new ListNode(k % 10);
            dummy = dummy.next;
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;
        }
        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }
        return n.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(a, b);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
