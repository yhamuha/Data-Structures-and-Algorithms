package lc.linkedlist.m;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    // O(n) O(n)
    public Node copyRandomList(Node head) {
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            Node copy = new Node(current.val);
            current.next = copy;
            copy.next = next;
            current = next;
        }
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        current = head;
        Node dummy = new Node(0);
        Node copy, copyTail = dummy;
        while (current != null) {
            next = current.next.next;
            copy = current.next;
            copyTail.next = copy;
            copyTail = copy;
            current.next = next;
            current = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        System.out.println("Original list:");
        printList(n1);

        CopyListWithRandomPointer copier = new CopyListWithRandomPointer();

        Node copiedHead = copier.copyRandomList(n1);

        System.out.println("\nCopied list:");
        printList(copiedHead);
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            int randomVal = current.random != null ? current.random.val : -1;
            System.out.println("Node val: " + current.val + ", Random points to: " + randomVal);
            current = current.next;
        }
    }
}
