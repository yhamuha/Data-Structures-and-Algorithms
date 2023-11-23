package lc.linkedlist.e;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 // https://www.youtube.com/watch?v=jY-EUKXYT20&ab_channel=DineshVaryani
public class ReverseLinkedList {
     //            c
     //  <1<2<3<4<5
     //           p n
     // return p
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while (curr != null) {
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
    }

    public static void main(String[] args) {

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode reversedHead = reverseLinkedList.reverseList(head);

        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
