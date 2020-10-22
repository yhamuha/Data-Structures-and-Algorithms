package misc.linkedList.oneWayLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        Node node = new Node();
        node.addBeforeHead(1);
        node.addBeforeHead(2);
        node.addBeforeHead(3);

        // H
        // 3 2 1
        //     T
        System.out.println(node.head.next);

    }
}
