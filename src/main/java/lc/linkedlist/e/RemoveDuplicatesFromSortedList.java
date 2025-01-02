package lc.linkedlist.e;

public class RemoveDuplicatesFromSortedList {
    // O(n) O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode start = head;
        ListNode end = head;
        while(end!=null) {
            if(start.val!=end.val) {
                start.next=end;
                start = end;
            }
            end=end.next;
        }
        start.next=null;
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode result = solution.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

