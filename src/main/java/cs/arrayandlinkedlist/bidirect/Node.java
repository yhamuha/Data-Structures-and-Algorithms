package cs.arrayandlinkedlist.bidirect;

public class Node {

    Node head = null;
    Node tail = null;

    // bidirectional Linked List
    public Node next;
    public Node previous;
    public int data;

    void addBeforeHead(int data) {
        Node newHead = new Node();
        newHead.data = data;
        if (head == null) {
            head = newHead;
            tail = newHead;
        } else {
            newHead.next = head;
            head.previous = newHead;
            head = newHead;
        }
    }

    void addAfterTail (int data) {
        Node newTail = new Node();
        newTail.data = data;

        if (head == null) {
            head = newTail;
            tail = newTail;
        } else {
            tail.next = newTail;
            newTail.previous = tail;
            tail = newTail;
        }
    }

    @Override
    public String toString() {
        return  "head=" + head.data +
                ", tail=" + tail.data;
    }

    void printAllNodes() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.addAfterTail(1);
        node.addAfterTail(2);
        node.addAfterTail(3);
        System.out.println(node);
        node.printAllNodes();
    }
}
