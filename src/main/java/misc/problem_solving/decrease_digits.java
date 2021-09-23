package misc.problem_solving;

/**
 *
 */
public class decrease_digits {
    public static void main(String[] args) {
        int x = 12345;

        while (x >= 0) {
            if (x == 0) break;
            System.out.println(x);
            x /=10;
        }
    }
}
