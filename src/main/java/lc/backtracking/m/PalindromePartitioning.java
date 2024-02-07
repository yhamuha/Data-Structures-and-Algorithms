package lc.backtracking.m;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    // TC: O(n^2 * 2^n)
    public List<List<String>> partition(String s) {
        // SC: O(m)
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0);
        return list;
    }

    private void backtrack (List<List<String>> list, List<String> tempList, String s, int start){
        if(start == s.length())
            list.add(new ArrayList<>(tempList));
        else{
            for(int i=start; i<s.length(); i++) {
                if(isPalindrome(s,start,i)){
                    tempList.add(s.substring(start,i+1));
                    backtrack(list,tempList,s,i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high){
        while (low < high)
            if (s.charAt(low++) != s.charAt(high--)) // from low to high toward to center
                return false;
        return true;
    }

    public static void main(String[] args) {
        var pp = new PalindromePartitioning();
        String s = "aab";
        System.out.println(pp.partition(s));
    }
}
