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
     * time complexity for add to head or tail equals: O(1)
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

    /**
     *
     * @param data
     */
    void addAfterTail(int data) {
        Node newTail = new Node();
        newTail.data = data;
        if (head == null) head = newTail;
        newTail.next = tail;
        tail = newTail;
    }

    /**
     *
     * @param data
     * @return
     */
    Node search(int data) {
        Node node = head;
        while (node !=null) {
            if (node.data == data) return node;
            node = node.next;
        }
        return null;
    }
}

