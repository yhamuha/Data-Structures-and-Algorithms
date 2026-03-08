package lc.linkedlist.e;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    // "runner" Floyd's Cycle Detection Algorithm
    // O(n) O(1)
    /*static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }*/

    // O(n) O(n)
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            if (visitedNodes.contains(currentNode)) {
                return true;
            }
            visitedNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        System.out.println(hasCycle(head));
    }
}
