package lc.linkedlist.m;

public class RemoveNthNodeFromEndOfList {
    // O(n) O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) return null;
        if (head.next==null) return null;
        int nodeCounter=0;                              
        ListNode curr = head;
        while (curr!=null) {
            curr=curr.next;
            nodeCounter++;
        }
        ListNode del = null; ListNode move = head;
        if (nodeCounter==n) {
            head=move.next;
            move.next=null;
            return head;
        }
        for (int i=1; i<nodeCounter-n; i++)
            move=move.next;
        del=move.next;
        move.next = move.next.next;
        del.next=null;
        return head;
    }

    public static void main(String[] args) {
        var rnelem = new RemoveNthNodeFromEndOfList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = rnelem.removeNthFromEnd(head,2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
