package lc.linkedlist.e;

public class MergeTwoSortedLists {
    // O(n) O(1)
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode curr = root;
        ListNode id1 = list1;
        ListNode id2 = list2;
        while (id1 != null && id2 != null) {
            if (id1.val < id2.val) {
                curr.next = id1;
                curr = id1;
                id1 = curr.next;
            } else {
                curr.next = id2;
                curr = id2;
                id2 = curr.next;
            }
        }
        if (id1 != null) {
            curr.next = id1;
            curr = id1;
            id1 = curr.next;
        }
        if (id2 != null) {
            curr.next = id2;
            curr = id2;
            id2 = curr.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
