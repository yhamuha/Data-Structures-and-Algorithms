package onemoretime.palindrome.longestPalindromeSubstring;

/**
 *
 */
public class Solution {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }

    // O(n), O(n)
    static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        // put all the lowerCase letter only to Builder
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    // using java8 streams
    static boolean isPalindromeUsingStreams(String s) {
        StringBuilder builder = new StringBuilder();

        s.chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }

}
