package lc.linkedlist.m;

public class ReorderList {
    // O(n) O(1)
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newNode = reverseList(slow.next);
        slow.next=null;
        ListNode curr = head;
        ListNode dummy = newNode;
        while(head!=null && dummy!=null){
            ListNode temp = curr.next;
            curr.next=dummy;
            ListNode temp2=dummy.next;
            dummy.next=temp;
            curr=temp;
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
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        rl.reorderList(list1);
        while(list1 != null) {
            System.out.print(list1.val + " ");
            list1 = list1.next;
        }
    }
}
