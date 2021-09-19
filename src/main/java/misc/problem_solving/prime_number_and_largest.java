package misc.problem_solving;

import java.util.Scanner;

/**
 *
 */
public class prime_number_and_largest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0, large = 0;
        boolean isPrime = true;

        for (int i=1; i< a; i++) {
            isPrime = true;
            for (int j=2; j<i; j++) {
                if (i%j ==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i!=2) {
                count++;
                large = i;
                isPrime = false;
            }

        }
        System.out.print(count + " " + large);

    }

}
