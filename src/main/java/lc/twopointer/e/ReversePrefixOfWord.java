package lc.twopointer.e;

public class ReversePrefixOfWord {
    // O(n) O(n)
    static String reversePrefix(String word, char ch) {
        int left =0, right = word.indexOf(ch);
        if (right == -1)
            return word;
        StringBuilder sb = new StringBuilder(word);
        while (left < right) {
            sb.setCharAt(left, word.charAt(right));
            sb.setCharAt(right, word.charAt(left));
            left++;
            right--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
}
