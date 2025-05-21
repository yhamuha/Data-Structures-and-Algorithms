package lc.linkedlist.e;

public class PalindromeLinkedList {
    // O(n) O(1)
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode halfList = reverseList(slow);
        while (head != null && halfList != null) {
            if (head.val != halfList.val)
                return false;
            head = head.next;
            halfList = halfList.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        PalindromeLinkedList solution = new PalindromeLinkedList();
        System.out.println(solution.isPalindrome(head));
    }
}
