package misc.problem_solving;

import java.util.Scanner;

/**
 *
 */
public class add_mult_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        if (a1>a2 || b1>b2) {
            System.out.println("Incorrect input");
        }

        int add_result = 0;
        for (int i=a1; a1<=a2; a1++) {
            add_result = add_result + a1;
        }

        int mult_result = 1;
        for (int i=b1; b1<=b2; b1++) {
            mult_result = mult_result * b1;
        }
        System.out.println("add_result_of_given_area: " + add_result);
        System.out.println("mult_result_of_given_area: " + mult_result);
    }
}
