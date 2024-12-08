package lc.linkedlist.e;

public class IntersectionOfTwoLinkedLists {
    // O(n+m) O(1)
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersection;
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersection;
        ListNode result = getIntersectionNode(headA, headB);
        System.out.println(result != null ? result.val : "No intersection");
    }
}
