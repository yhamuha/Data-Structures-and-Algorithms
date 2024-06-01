package lc.linkedlist.m;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
    // O(n) O(n)
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode rev = reverse(head);
        while (rev != null) {
            if (stack.isEmpty() || (!stack.isEmpty() && rev.val >= stack.peek())) {
                stack.push(rev.val);
            }
            rev = rev.next;
        }
        ListNode res = new ListNode();
        ListNode r = res;
        while (!stack.isEmpty()) {
            r.next = new ListNode(stack.pop());
            r = r.next;
        }
        return res.next;
    }
    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);
        var remNodes = new RemoveNodesFromLinkedList();
        ListNode result = remNodes.removeNodes(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

}
