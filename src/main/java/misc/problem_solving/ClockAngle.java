package misc.problem_solving;

/**
 *
 */
public class ClockAngle {

    public static void main(String[] args) {
        ClockAngle ca = new ClockAngle();
        if (ca.clockAngle(3, 40) == 130) {
            System.out.println("+");
        }
        if (ca.clockAngle(1, 20) == 70) {
            System.out.println("+");
        }
        if (ca.clockAngle(5, 15) == 67.5) {
            System.out.println("+");
        }
    }

    public double clockAngle(int hour, int minutes) {
        final double MINUTES_PER_HOUR = 60;
        final double DEGREES_PER_MINUTE = 360 / MINUTES_PER_HOUR;
        final double DEGREES_PER_HOUR = 360 / 12;

        double minuteAngle = minutes * DEGREES_PER_MINUTE;
        double hourAngle = hour * DEGREES_PER_HOUR + (minutes / MINUTES_PER_HOUR) * DEGREES_PER_HOUR;

        double diff = Math.abs(minuteAngle - hourAngle);
        if (diff > 180) {
            return 360 - diff;
        }
        return diff;
    }
}
