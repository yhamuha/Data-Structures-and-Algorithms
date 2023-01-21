package misc.java_2023;

/**
 *
 */
public class Palindrome {

    public static void palindrome_StringBuffer(String s) {
        String original = s;
        StringBuilder sb = new StringBuilder(original);

        if (original.equals(sb.reverse().toString())) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not palindrome");
        }
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
            System.out.println(original + " is a palindrome\n");
        } else {
            System.out.println(original + " is not a palindrome\n");
        }

        /* palindrome 2 */
        System.out.println("palindrome 2:");
        System.out.println("=============");
        palindrome_StringBuffer("saab");
    }
}
