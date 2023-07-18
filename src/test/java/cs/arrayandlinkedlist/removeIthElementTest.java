package cs.arrayandlinkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveIthElementTest {

    @Test
    public void testRemoveIthElement_SuccessfulRemoval() {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int[] expectedResult = {1, 2, 4, 5};

        int[] result = RemoveIthElement.removeIthElement(arr, index);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemoveIthElement_EmptyArray() {
        int[] arr = {};
        int index = 2;

        int[] result = RemoveIthElement.removeIthElement(arr, index);

        assertNull(result);
    }

    @Test
    public void testRemoveIthElement_IndexOutOfBounds() {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 5;

        int[] result = RemoveIthElement.removeIthElement(arr, index);

        assertNull(result);
    }

    @Test
    public void testRemoveIthElement_NegativeIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        int index = -1;

        int[] result = RemoveIthElement.removeIthElement(arr, index);

        assertNull(result);
    }

    @Test
    public void testRemoveIthElement_SingleElementArray() {
        int[] arr = {1};
        int index = 0;
        int[] expectedResult = {};

        int[] result = RemoveIthElement.removeIthElement(arr, index);

        assertArrayEquals(expectedResult, result);
    }
}
