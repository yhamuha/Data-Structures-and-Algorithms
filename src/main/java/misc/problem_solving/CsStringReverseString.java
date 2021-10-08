package misc.problem_solving;

/**
 *
 */
public class CsStringReverseString {
    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        reverseString(s);
        System.out.print(s);
    }

    // two pointer O(n), O(1)
    static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
