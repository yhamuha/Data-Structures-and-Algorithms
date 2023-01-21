package misc.java_2023;

/**
 *
 */
public class Palindrome {
    public static void main(String[] args) {
        String original = "soaos";
        String reversed = "";

        // reverse original string
        for (int i = original.length()-1; i>=0; i--) {
            reversed += original.charAt(i);
        }

        // checking for equals
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
