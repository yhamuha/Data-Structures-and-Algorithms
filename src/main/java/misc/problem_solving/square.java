package misc.problem_solving;
import java.util.Scanner;
/**
 *
 */
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = sc.nextInt();
        System.out.println("Cols: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Value is <= 0");
        } else {
            for (int i=1; i<=rows; i++) {
                for (int j=1; j<= cols; j++) {
                    System.out.print("B");
                }
                System.out.println();
            }

        }
    }
}
