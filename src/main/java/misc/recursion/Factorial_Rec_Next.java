package misc.recursion;

/**
 *
 */
public class Factorial_Rec_Next {
    public static void main(String[] args) {
        System.out.println(fact_rec(5));
    }

    static int fact_rec (int i) {

        if ( i == 0) return 1;

        return i * fact_rec(i-1);
    }
}
