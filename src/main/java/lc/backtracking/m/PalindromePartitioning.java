package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    // O(2^n * n) O(2^n * n)
    public List<List<String>> partition(String s) {
        List<List<String>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), s, 0);
        return resultList;
    }

    private void backtrack(List<List<String>> list, List<String> tempList, String s, int start) {
        if (start == s.length())
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    tempList.add(s.substring(start, i + 1));
                    backtrack(list, tempList, s, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high)
            if (s.charAt(low++) != s.charAt(high--))
                return false;
        return true;
    }

    public static void main(String[] args) {
        var pp = new PalindromePartitioning();
        String s = "aab";
        System.out.println(pp.partition(s));
    }
}
