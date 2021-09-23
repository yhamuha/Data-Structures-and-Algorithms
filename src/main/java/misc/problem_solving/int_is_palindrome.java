package misc.problem_solving;

/**
 *
 */
public class int_is_palindrome {
    public static void main(String[] args) {
        int x = 623421;
        System.out.println(IsPalindrome(x));
    }

    public static boolean IsPalindrome(int x) {

        // special cases
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
