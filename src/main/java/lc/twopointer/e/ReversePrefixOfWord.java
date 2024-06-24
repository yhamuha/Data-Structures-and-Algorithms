package lc.twopointer.e;

public class ReversePrefixOfWord {
    // O(n) O(n)
    public String reversePrefix(String word, char ch) {
        int right = word.indexOf(ch);
        if (right == -1)
            return word;
        StringBuilder sb = new StringBuilder(word);
        int left = 0;
        for(;left<right;right--){
            sb.setCharAt(left,word.charAt(right));
            sb.setCharAt(right,word.charAt(left));
            left++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        ReversePrefixOfWord rpow = new ReversePrefixOfWord();
        System.out.println(rpow.reversePrefix(word, ch));
    }
}
