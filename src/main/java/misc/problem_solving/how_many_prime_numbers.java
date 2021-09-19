package misc.problem_solving;

import java.util.Scanner;

/**
 *
 */
public class how_many_prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

     // 51:47

        boolean isPrime;

        int counter = 0;
        for (int i = 1; i < a; i++) {

                isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    counter++;
                }
            }


        }
    }

