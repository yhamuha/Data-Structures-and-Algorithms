package lc.linkedlist.e;

// https://www.youtube.com/watch?v=OQtvTZxA7-k&ab_channel=NikhilLohia

import java.util.HashSet;

public class LinkedListCycle {
    // "runner" to SC O(1)
    public boolean hasCycle(ListNode head) {
        ListNode slow_pointer = head, fast_pointer = head;
        while (fast_pointer != null && fast_pointer.next != null) {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if (slow_pointer == fast_pointer) {
                return true;
            }
        }
        return false;
    }
    // hashset O(n)
    public boolean hasCycle_h(ListNode head) {
        HashSet<ListNode> visited_nodes = new HashSet<>();
        ListNode current_node = head;
        while (current_node != null) {
            if (visited_nodes.contains(current_node)) {
                return true;
            }
            visited_nodes.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        var llc = new LinkedListCycle();
        System.out.println(llc.hasCycle(head));
    }
}
