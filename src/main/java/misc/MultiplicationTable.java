package misc;

import java.util.Scanner;
/**
 * The {@code MultiplicationTable} class
 * shows muliplication table implementation
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N * i));
        }

        sc.close();
    }
}
