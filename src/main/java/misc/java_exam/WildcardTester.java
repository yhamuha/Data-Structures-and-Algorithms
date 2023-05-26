package misc.java_exam;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class WildcardTester {
    public static double sumList (List<? extends Number> list) {
        float sum = 1.0f;
        for (Number n : list) sum = sum + n.floatValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Float> ref = Arrays.asList(16.0f, 1.0f, 3.0f);
        System.out.println(sumList(ref));
    }
}

// 21.0