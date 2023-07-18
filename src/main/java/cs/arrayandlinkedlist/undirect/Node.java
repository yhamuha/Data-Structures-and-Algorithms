package cs.arrayandlinkedlist.undirect;

public class Node {

    public Node next;
    public int data;

    Node head = null;
    Node tail = null;

    // add to the start of LinkedList O(1)
    void addBeforeHead(int data) {
        Node newHead = new Node();
        newHead.data = data;
        newHead.next = head;
        if (head == null)
            tail = newHead;
        head = newHead;
    }

    // add to the end of LinkedList O(1)
    void addAfterTail(int data) {
        Node newTail = new Node();
        newTail.data = data;
        if (head == null) head = newTail;
        newTail.next = tail;
        tail = newTail;
    }

    @Override
    public String toString() {
        return  "head=" + head.data
                + " tail=" + tail.data;
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
        node.addBeforeHead(1);
        node.addBeforeHead(2);
        node.addBeforeHead(3);
        node.addBeforeHead(4);
        node.addBeforeHead(5);
        node.addAfterTail(0);
        node.addAfterTail(-1);
        System.out.println(node);
        node.printAllNodes();
    }
}

