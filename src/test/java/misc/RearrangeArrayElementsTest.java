package misc;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RearrangeArrayElementsTest {

    @Test
    public void testRearrange() {
        int[] arr = { -9, 5, 1, -2, -15, 7, 12, -3, 2 };
        int[] expected = { -9, -3, -15, -2, 1, 7, 12, 5, 2 };

        RearrangeArrayElements.rearrange(arr);

        int[] actual = arr;

        assertArrayEquals(expected, actual);
    }
}
