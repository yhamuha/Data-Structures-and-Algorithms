package cs.queue;

public class Node {

    Node HEAD = null;
    Node TAIL = null;

    int value;
    Node prev;

    public Node(int value) { this.value = value; }

    void enqueue (int value) {
        Node newNode = new Node(value);
        if (TAIL != null) TAIL.prev = newNode;
        TAIL = newNode;
        if (HEAD == null) HEAD = TAIL;
    }

    int dequeue () throws Exception {
        if (HEAD == null) throw new Exception("Queue is Empty");
        int value = HEAD.value;
        HEAD = HEAD.prev;
        if (HEAD == null) TAIL = null;
        return value;
    }
}
