package misc.java_2023;

/**
 *
 */
public class Palindrome {

    public static void palindrome_StringBuffer(String s) {
        String original = s;
        StringBuilder sb = new StringBuilder(original);

        if (original.equals(sb.reverse().toString())) {
            System.out.println("\"" + original + "\"" + " is a palindrome\n");
        } else {
            System.out.println("\"" + original + "\"" + " is not palindrome\n");
        }
    }

    public static boolean isPalindrome (String s) {
        int n = s.length();
        for (int i=0; i<(n/2); ++i) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String original = "soaos";
        String reversed = "";

        // reverse original string
        for (int i = original.length()-1; i>=0; i--) {
            reversed += original.charAt(i);
        }

        // checking for equals
        System.out.println("palindrome 1:");
        System.out.println("=============");
        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\"" + " is a palindrome\n");
        } else {
            System.out.println("\"" + original + "\"" +  " is not a palindrome\n");
        }

        /* palindrome 2 */
        System.out.println("palindrome 2:");
        System.out.println("=============");
        palindrome_StringBuffer("saab");

        /* palindrome 3 */
        System.out.println("palindrome 3:");
        System.out.println("=============");
        String str = "soap";
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\"" + " is a palindrome\n");
        } else {
            System.out.println("\"" + str + "\"" + " is not a palindrome\n");
        }
    }
}
