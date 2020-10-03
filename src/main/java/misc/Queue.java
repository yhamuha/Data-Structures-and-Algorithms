package misc;

public class Queue {

    // start queue pointer
    Node HEAD = null;
    // end queue pointer
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

    // del node from HEAD
    // and peak (return value)
    int dequeue() throws Exception {
        if (HEAD == null)
            throw new Exception("Queue is empty");
        int value = HEAD.value;
        HEAD = HEAD.prev;
        if (HEAD == null)
            TAIL = null;
        return value;

    }

}
