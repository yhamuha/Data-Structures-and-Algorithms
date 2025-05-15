package lc.slidingwindow.m;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShortestAndLexicographicallySmallestBeautifulString {
    // O(n log n) O(n)
    static String shortestBeautifulSubstring(String s, int k) {
        final int n = s.length();
        if (n < k)
            return "";
        List<String> beauty = new ArrayList<>();
        int min = n;
        for (int i = 0, j = 0, count = 0; i < n; j++) {
            if (s.charAt(j) == '1')
                count++;
            while (count > k || (j < n && s.charAt(j) == '0')) {
                if (s.charAt(i) == '1')
                    count--;
                i++;
            }

            if (count == k) {
                int l = j - i + 1;
                if (min > l) {
                    beauty.clear();
                    beauty.add(s.substring(i, j + 1));
                    min = l;
                } else if (min == l)
                    beauty.add(s.substring(i, j + 1));
            }
        }
        beauty.sort(Comparator.naturalOrder());
        return beauty.isEmpty() ? "" : beauty.get(0);
    }

    public static void main(String[] args) {
        String s = "100011001";
        int k = 3;
        System.out.println(shortestBeautifulSubstring(s, k));
    }
}
