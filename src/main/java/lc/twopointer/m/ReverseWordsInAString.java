package lc.twopointer.m;

public class ReverseWordsInAString {
    // O(n) O(n)
    static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        if (s.length() == 1 && s.charAt(0) == ' ') {
            return ans.toString();
        }
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ')
                --i;
             else {
                int j = i;
                if (ans.length() > 0) {
                    ans.append(" ");
                }
                while (j >= 0 && s.charAt(j) != ' ')
                    --j;
                ans.append(s.substring(j + 1, i + 1));
                i = j;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
