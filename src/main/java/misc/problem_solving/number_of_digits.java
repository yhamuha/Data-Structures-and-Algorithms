package misc.problem_solving;

import java.util.Scanner;

/**
 *
 */
public class number_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int result = 1;
        int q = a/10;

        while (q != 0) {
            q=q/10;
            result++;
        }
        System.out.println(result);
    }
}
