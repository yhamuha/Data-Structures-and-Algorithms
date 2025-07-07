package lc.backtracking.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {
    // O(4^n * n) O(4^n * n)
    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();
        if (digits.length() == 0) return resultList;
        Map<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        backtrack(digits, 0, hm, new StringBuilder(), resultList);
        return resultList;
    }

    private void backtrack(String digits, int i, Map<Character, String> hm, StringBuilder sb, List<String> resultList) {
        if (i == digits.length()) {
            resultList.add(sb.toString());
            return;
        }
        String curr = hm.get(digits.charAt(i));
        for (int k = 0; k < curr.length(); k++) {
            sb.append(curr.charAt(k));
            backtrack(digits, i + 1, hm, sb, resultList);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfaPhoneNumber lcopn = new LetterCombinationsOfaPhoneNumber();
        String digits = "23";
        System.out.println(lcopn.letterCombinations(digits));
    }
}