package misc.linkedList.oneWayLinkedList;

import java.util.Arrays;

public class MyLinkedListTest {
    public static void main(String[] args) {
        Node node = new Node();
        node.addBeforeHead(1);
        node.addBeforeHead(2);
        node.addBeforeHead(3);
        node.addBeforeHead(4);
        node.addBeforeHead(5);
        node.addBeforeHead(6);


        // H
        // 3 2 1
        //     T
        // System.out.println(node.head.next);
        // System.out.println("node: " + node.search(9));

        System.out.println(node.getKToLastNode(3));
    }
}
