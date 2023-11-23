package lc.linkedlist.e;


public class MergeTwoSortedLists {
    // O(n+m)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode curr = root;
        ListNode index1 = list1;
        ListNode index2 = list2;
        while (index1 != null && index2 != null) {
            if (index1.val < index2.val) {
                curr.next = index1; curr = index1; index1 = curr.next;
            } else {
                curr.next = index2; curr = index2; index2 = curr.next;
            }
        }
        if (index1 != null) {
            curr.next = index1; curr = index1; index1 = curr.next;
        }
        if (index2 != null) {
            curr.next = index2; curr = index2; index2 = curr.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        var mtsl = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(1); list1.next = new ListNode(3); list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2); list2.next = new ListNode(4); list2.next.next = new ListNode(6);

        ListNode result = mtsl.mergeTwoLists(list1, list2);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
