package misc.problem_solving;

/**
 *
 */
public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(removePalindromeSub2(s));
    }

    // return steps on which palindrome sequence might be removed
    static int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        // See below for code that compacts this into one line.
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversedString = sb.toString();
        if (reversedString.equals(s)) {
            return 1;
        }
        return 2;
    }

    // two-pointer technique
    static int removePalindromeSub2(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (isPalindrome(s)) {
            return 1;
        }
        return 2;
    }

    static private boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}