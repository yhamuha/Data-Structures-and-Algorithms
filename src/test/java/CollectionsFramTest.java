import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionsFramTest {

    @Test
    public void given_binaryLiteral_thenReturnDecimalValue () {


        byte five = 0b101;
        assertEquals((byte)5, five);
    }
}
