package lc.linkedlist.e;

public class RemoveLinkedListElements {
    // O(n) O(1)
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode temp = newHead;
        if(head==null){
            return head;
        }
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            } else {
                temp=temp.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int val = 6;
        RemoveLinkedListElements rlle = new RemoveLinkedListElements();
        ListNode result = rlle.removeElements(head, val);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
