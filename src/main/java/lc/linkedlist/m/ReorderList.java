package lc.linkedlist.m;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return ;
        ListNode slow = head;                       // finding middle element
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newNode = reverseList(slow.next);  // reversing the second half of the list
        slow.next=null;                             // breaking the list from the middle
        ListNode curr = head;                       // merging both list; first half list pointer
        ListNode dummy = newNode;                   // second half list pointer
        while(head!=null && dummy!=null){
            ListNode temp = curr.next;              // pointer to store next element of curr(1st half list)
            curr.next=dummy;                        // link element of 1st half to that of second half
            ListNode temp2=dummy.next;              // pointer to store next element of dummy(2nd half list)
            dummy.next=temp;                        // link the rest of the first half list
            curr=temp;                              // increment curr and dummy pointer to do the same thing again
                                                    // and again util we reach end of any one list or both list
            dummy=temp2;
        }
    }
    public ListNode reverseList(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        var rl = new ReorderList();
        ListNode list1 = new ListNode(1);       // node instance's
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        list1.next.next.next = new ListNode(8);
        rl.reorderList(list1);                      // reorder
        while(list1 != null) {                      // traversing
            System.out.print(list1.val + " ");
            list1 = list1.next;
        }
    }
}
