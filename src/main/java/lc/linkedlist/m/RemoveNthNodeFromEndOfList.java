package lc.linkedlist.m;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)                          // if head is null - no node is found
            return null;
        if(head.next==null)                     // if only one node is found
            return null;
        int cnt=0;                              // To find the Size of the List
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            cnt++;
        }
        ListNode del = null;
        ListNode move = head;
        if(cnt==n){                             // Provision for the last node
            head=move.next;
            move.next=null;
            return head;
        }
        for(int i=1; i<cnt-n; i++){             // For iteration upto the position
            move=move.next;
        }
        del=move.next;                          // Logic To delete the node
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
