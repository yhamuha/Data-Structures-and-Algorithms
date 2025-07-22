package lc.strings;

public class SecondLargestDigitInAString {
    // O(n) O(1)
    static int findSecondLargest(String s) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (ch > first) {
                    second = first;
                    first = ch;
                } else if (ch > second && ch != first) {
                    second = ch;
                }
            } else continue;
        }
        return second;
    }

    public static void main(String[] str) {
        System.out.println(findSecondLargest("dfa12321afd"));
    }
}
