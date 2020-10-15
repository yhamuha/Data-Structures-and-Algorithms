package misc.recursion;

// 4

// s[0] == s[n-1]   true
// s[1] == s[n-2]   true
// s[n/2] == s[n/2] true

public class RecursionIsPalindrome {
    public static void main(String[] args) {

    }

    boolean symmetricCharsAreEqual(String str, int charIndex) {
        int symmetricChar = str.length() - 1 - charIndex;
        return str.charAt(charIndex) == str.charAt(symmetricChar);
    }

    boolean isPalindrome(String str, int n) {
        if (n == str.length() / 2) return true;
        return symmetricCharsAreEqual(str, n) && isPalindrome(str, n + 1);
    }

    // wrapper
    boolean isPalindrome(String str) {
        return isPalindrome(str, 0);
    }


}
