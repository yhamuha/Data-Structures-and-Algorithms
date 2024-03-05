package lc.linkedlist.e;

public class MiddleOfTheLinkedList {
    // O(n) O(1)
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {   // count all the nodes
            count++;
            current = current.next;
        }
        current = head; // reset pointer
        for (int i = 0; i < count / 2; i++) {   // determine the middle one
            current = current.next;
        }
        return current;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode middleNode = middleOfTheLinkedList.middleNode(head);

        System.out.println("Middle node value: " + middleNode.val);
    }
}
