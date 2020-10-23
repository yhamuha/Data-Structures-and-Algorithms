package misc.linkedList;

public class MyTwoWayLinkedList {
    public static void main(String[] args) {

    }

    Node head = null;
    Node tail = null;

    class Node {
        public Node next;
        public Node previous;
        public int data;

        /**
         * time complexity for add in head or tail equal O(1)
         * @param data
         */
        void addAfterTail(int data) {
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

        /**
         *
         * @param prev
         * @param newNode
         */
        void insert(Node prev, Node newNode) {
            prev.next.previous = newNode;
            newNode.next = prev.next;
            prev.next = newNode;
            newNode.previous = prev;
        }

        /**
         *
         * @param data
         */
//        void remove(int data) {
//            Node toDelete = search(data);
//            if (toDelete == null) return;
//            if (toDelete == head) {
//                head = head.next;
//                head.previous = null;
//            } else if (toDelete.next == null) {
//                toDelete.previous.next = null;
//            } else {
//                toDelete.previous.next = toDelete.next;
//                toDelete.next.previous = toDelete.previous;
//            }
//        }
    }
}
