package lc.dp.m;

public class LongestPalindromicSubstring {
    // SC: O(1)
    int resultStart =0;
    int resultLength=0;
    public String longestPalindrome(String s) {
        int strLength = s.length();
        if(s.length()<2) return s;
        // TC: O(n)
        for(int start =0; start<strLength; start++){
            expandRange(s, start, start);
            expandRange(s, start, start+1);
        }
        return s.substring(resultStart, resultStart+resultLength);
    }

    private void expandRange(String s, int begin, int end){
        // TC: O(n)
        while(begin>=0 && end<s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        if (resultStart < end - begin - 1) {
            resultStart = begin+1;
            resultLength= end - begin -1;
        }
    }

    public static void main(String[] args) {
        var lps = new LongestPalindromicSubstring();
        String s = "babad";
        System.out.println(lps.longestPalindrome(s));
    }
}
