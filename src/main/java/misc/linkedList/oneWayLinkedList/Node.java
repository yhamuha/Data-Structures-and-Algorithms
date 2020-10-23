package misc.linkedList.oneWayLinkedList;

public class Node {

    // global variables
        Node head = null;
        Node tail = null;

    // class Node
        public Node next;
        public int data;

        /**
         * time complexity for add to head or tail equals: O(1)
         *
         * @param data
         */
        public void addBeforeHead(int data) {
            Node newHead = new Node();
            newHead.data = data;
            newHead.next = head;
            if (head == null)
                tail = newHead;
            head = newHead;
        }

        /**
         * @param data
         */
        public void addAfterTail(int data) {
            Node newTail = new Node();
            newTail.data = data;
            if (head == null) head = newTail;
            newTail.next = tail;
            tail = newTail;
        }

        /**
         * @param data
         * @return
         */
        public Node search(int data) {
            Node node = head;
            while (node != null) {
                if (node.data == data) return node;
                node = node.next;
            }
            return null;
        }

        /**
         * @param prev
         * @param newNode
         */
        public void insert(Node prev, Node newNode) {
            newNode.next = prev.next;
            prev.next = newNode;
        }

        /**
         * @param data
         */
        public void remove(int data) {
            Node prev = head, current = head;
            while (current != null) {
                if (current.data == data) {
                    if (current == head) head = head.next;
                    else prev.next = current.next;
                    break;
                }
                prev = current;
                current = current.next;
            }
        }

    /**
     *
     * @param head
     * @return
     */
    public Node reverseLinkedList(Node head) {
            Node reversed = null;
            while (head != null) {
                Node originalNext = head.next;
                head.next = reversed;
                reversed = head;
                head = originalNext;
            }
            return reversed;
        }

    /**
     *
     * @param sourceHead
     * @param partionValue
     * @return
     */
    public Node partition(Node sourceHead, int partionValue) {
            Node head = sourceHead;
            Node tail = sourceHead;
            while (sourceHead != null) {
                Node next = sourceHead.next;
                if (sourceHead.data < partionValue) {
                    sourceHead.next = head;
                    head = sourceHead;
                } else {
                    tail.next = sourceHead;
                    tail = sourceHead;
                }
                sourceHead = next;
            }
            tail.next = null;
            return head;
        }

    /**
     *
     * @param k     index of element to find from end of linked list
     * @return      value of sought-for element
     */
    public Node getKToLastNode(int k) {
        // set a,b to head
        Node a = head, b = head;

        // move b to k nodes
        while (k > 0) {
            b = b.next;
            k--;
        }

        // move sync a, b to the end of linked list
        while (b.next != null) {
            a = a.next;
            b = b.next;
        }

        // a will be sought-for element
        return a;
    }

    @Override
    public String toString() {
        return "{data: " + data +
                '}';
    }
}
