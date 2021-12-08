package misc.linkedList.mergelist;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1); // dummy.next will be the new head
        ListNode curr = dummy;

        while (true) {
            if (l1 == null && l2 == null) {
                break;
            }

            if (l1 == null) {
                curr.next = new ListNode(l2.val);
                curr = curr.next;

                l2 = l2.next;
                continue;
            }

            if (l2 == null) {
                curr.next = new ListNode(l1.val);
                curr = curr.next;

                l1 = l1.next;
                continue;
            }

            if (l1.val <= l2.val) {
                curr.next = new ListNode(l1.val);
                curr = curr.next;

                l1 = l1.next;
            } else {
                curr.next = new ListNode(l2.val);
                curr = curr.next;

                l2 = l2.next;
            }
        }

        return dummy.next;
    }
}
