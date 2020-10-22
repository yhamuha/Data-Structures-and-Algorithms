package misc.linkedList;

public class RunnerMethod {
    public static void main(String[] args) {

    }

    class Node {
        public Node next;
        public int data;
    }

    void rearrangeList(Node head) {

        // init pointer
        Node slow = head, fast = head;

        // move slow and fast
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // set rightSide to the middle of list
        Node leftSide = head, rightSide = slow;

        // list elements permutations
        while (rightSide != null) {
            Node originalNext = leftSide.next;
            leftSide.next = rightSide;
            rightSide = rightSide.next;
            if (rightSide == null) return;
            leftSide.next.next = originalNext;
            leftSide = originalNext;
        }
    }
}
