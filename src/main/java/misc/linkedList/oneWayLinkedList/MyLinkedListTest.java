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

        float f = 34.8f;
        int i = (int) Math.floor(f);
        int y = (int) Math.ceil(f);
        System.out.println(i);
        System.out.println(y);
        int res = (int) (f % 1);
        System.out.println(res);

        // H
        // 3 2 1
        //     T
        // System.out.println(node.head.next);
        // System.out.println("node: " + node.search(9));

        // System.out.println(node.getKToLastNode(3));
    }
}
