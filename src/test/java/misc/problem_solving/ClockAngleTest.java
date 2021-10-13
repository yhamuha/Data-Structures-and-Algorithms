package misc.problem_solving;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class ClockAngleTest {

    @Test
    public void shouldBeCorrectBy_1_20() {
        ClockAngle cat = new ClockAngle();
        Assert.assertEquals(80.0, cat.clockAngle(1,20), 1e-9);
    }

    @Test
    public void shouldBeCorrectBy_3_40() {
        ClockAngle cat = new ClockAngle();
        Assert.assertEquals(130.0, cat.clockAngle(3,40), 1e-9);
    }

    @Test
    public void shouldBeCorrectBy_5_15() {
        ClockAngle cat = new ClockAngle();
        Assert.assertEquals(67.5, cat.clockAngle(5,15), 1e-9);
    }
}
