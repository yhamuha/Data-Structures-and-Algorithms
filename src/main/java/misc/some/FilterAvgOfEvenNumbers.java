package misc.some;

import java.util.Scanner;

/**
 * Calculate average of even numbers
 */
public class FilterAvgOfEvenNumbers {
    public static void main(String[] args) {

        int sumEven = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        while (x != 0) {
            if (x%2 == 0) {
                sumEven += x;
                counter += 1;
            }
            x = scanner.nextInt();
        }
        System.out.println(sumEven / counter);
    }
}
