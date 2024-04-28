package misc.recursion;

public class RecursionIsPalindrome {
    // O(n/2) O(n/2)
    boolean symmetricCharsAreEqual(String str, int charIndex) {
        int symmetricChar = str.length() - 1 - charIndex;
        return str.charAt(charIndex) == str.charAt(symmetricChar);
    }

    boolean isPalindrome(String str, int n) {
        if (n == str.length() / 2) return true;
        return symmetricCharsAreEqual(str, n) && isPalindrome(str, n + 1);
    }

    boolean isPalindrome(String str) {
        return isPalindrome(str, 0);
    }

    public static void main(String[] args) {
        RecursionIsPalindrome palindromeChecker = new RecursionIsPalindrome();
        String str1 = "racecar";
        String str2 = "hello";
        System.out.println(str1 + " is a palindrome: " + palindromeChecker.isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + palindromeChecker.isPalindrome(str2));
    }
}
