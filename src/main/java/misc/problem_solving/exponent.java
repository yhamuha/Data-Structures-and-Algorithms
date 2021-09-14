package misc.problem_solving;
import java.util.Scanner;
/**
 * exp using do-while
 */
public class exponent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exp: ");
        int exp = sc.nextInt();

        int result = 1;

        do {
            result = result * base;
            exp--;
        } while (exp >= 1);
        System.out.print("Result: " + result);
    }
}
