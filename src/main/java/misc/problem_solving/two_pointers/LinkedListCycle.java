package misc.problem_solving.two_pointers;

import misc.problem_solving.two_pointers.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);

        listNode.next = listNode;
        listNode.next = listNode2;
        listNode.next = listNode3;
        listNode.next = listNode4;

        System.out.println(hasCycle(listNode));
    }


    static boolean hasCycle(ListNode head) {
        if(head == null)return false;
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }


}


