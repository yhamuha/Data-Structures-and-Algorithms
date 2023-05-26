package onemoretime.palindrome;

/**
 *
 */
public class string_is_palindrome {
    public static void main(String[] args) {
        int  number = 100001;
        String stringNumber = String.valueOf(number);
        System.out.println(stringNumber);
        System.out.println(isPalindrome(stringNumber));
    }

    static boolean isPalindrome(String str)
    {
        // define left and right position
        int i = 0, j = str.length() - 1;
        // go through all the symbols comparing edge-left and edge-right elements on each iteration
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
