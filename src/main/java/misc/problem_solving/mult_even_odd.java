package misc.problem_solving;

import java.sql.SQLOutput;

/**
 * multiplication
 * - even
 * - odd
 */
public class mult_even_odd {
    public static void main(String[] args) {
//        int i;
        int even = 0;
        int odd = 1;

        long even_result = 1;
        long odd_result = 1;

        for(int i=1; i<=20; i++) {
            if ((i % 2) == even) {
                even_result = even_result * i;
            } if ((i % 2) == odd) {
                odd_result = odd_result * i;
            }
        }

        System.out.println("Multiply of even: " + even_result);
        System.out.println("Multiply of odd: " + odd_result);

    }
}
