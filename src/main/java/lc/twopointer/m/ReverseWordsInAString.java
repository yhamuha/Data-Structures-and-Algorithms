package lc.twopointer.m;

public class ReverseWordsInAString {
    public void reverseWords(char[] str) {
        reverse(str, 0, str.length - 1);
        reverseEachWords(str);
    }

    // reverse the whole input
    void reverse(char[] str, int s, int t) {
        while (s < t) {
            char tmp = str[s];
            str[s] = str[t];
            str[t] = tmp;
            s++;
            t--;
        }
    }

    // reverse each individual word
    void reverseEachWords(char[] str) {
        int i = 0, j = 0;
        int n = str.length;
        while (i < n && j < n) {
            while (i < n && str[i] == ' ') {
                i++;
            }
            j = i;
            while (j < n && str[j] != ' ') {
                j++;
            }
            reverse(str, i, j - 1);
            i = j;
        }
    }

    public static void main(String[] args) {
        char[] str = {' ', 't','h', 'i', 's', ' ', 'i', 's', ' ', 'a'};
        ReverseWordsInAString reverse = new ReverseWordsInAString();
        reverse.reverseWords(str);
        System.out.println(str);
    }
}
