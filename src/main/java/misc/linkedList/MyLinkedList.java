package misc.linkedList;

public class MyLinkedList {

    // global variables
    Node head = null;
    Node tail = null;

    // class Node
    class Node {
        public Node next;
        public int data;
    }

    /**
     *
     * @param data
     */
    void addBeforeHead(int data) {
        Node newHead = new Node();
        newHead.data = data;
        newHead.next = head;
        if (head == null)
            tail = newHead;
        head = newHead;
    }


}

