package misc.java_exam;

/**
 *
 */
public class StringMatchesTester {
    public static void main(String[] args) {
        String[] values = {"xy", "xay", "xaby", "xa"};
        for (String value : values) {
            if (value.matches("x.y")) {
                System.out.println(value);
            }
        }
    }
}
