package lc.linkedlist.e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {
    @Test
    public void testDeleteDuplicatesWithDuplicates() {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);

        ListNode result1 = solution.deleteDuplicates(head1);

        assertEquals(1, result1.val);
        assertEquals(2, result1.next.val);
        assertEquals(3, result1.next.next.val);
        assertNull(result1.next.next.next);
    }

    @Test
    public void testDeleteDuplicatesWithoutDuplicates() {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        ListNode result2 = solution.deleteDuplicates(head2);

        assertEquals(1, result2.val);
        assertEquals(2, result2.next.val);
        assertEquals(3, result2.next.next.val);
        assertNull(result2.next.next.next);
    }

    @Test
    public void testDeleteDuplicatesWithEmptyList() {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

        assertNull(solution.deleteDuplicates(null));
    }
}