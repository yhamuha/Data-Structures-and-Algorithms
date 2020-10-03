package misc;

public class Queue {

    Node HEAD = null;
    Node TAIL = null;

    // node of queue
    class Node {
        int value;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
    }

    // insert node to queue
    //  TAIL (Node) - ... - (Node) - HEAD(Node)
    void enqueue(int value) {
        Node newNode = new Node(value);
        if (TAIL != null)
            TAIL.prev = newNode;
        TAIL = newNode;
        if (HEAD == null)
            HEAD = TAIL;
    }

}
