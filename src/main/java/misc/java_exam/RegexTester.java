package misc.java_exam;

/**
 *
 */
public class RegexTester {
    public static void main(String[] args) {
        String[] values = {"9a4b x", "3a z", "a", "1a2b3c"};
        int counter = 0;
        for (String value : values) {
            if (value.matches("(\\d[a-z])+\\s\\w?")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
