package lc.linkedlist.e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    @Test
    public void testIsPalindromeWithPalindromeList() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        ListNode palindromeList = new ListNode(1);
        palindromeList.next = new ListNode(2);
        palindromeList.next.next = new ListNode(2);
        palindromeList.next.next.next = new ListNode(1);
        assertTrue(palindromeLinkedList.isPalindrome(palindromeList));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeList() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        ListNode nonPalindromeList = new ListNode(1);
        nonPalindromeList.next = new ListNode(2);
        nonPalindromeList.next.next = new ListNode(3);
        nonPalindromeList.next.next.next = new ListNode(4);
        assertFalse(palindromeLinkedList.isPalindrome(nonPalindromeList));
    }

    @Test
    public void testIsPalindromeWithEmptyList() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        assertTrue(palindromeLinkedList.isPalindrome(null));
    }

}