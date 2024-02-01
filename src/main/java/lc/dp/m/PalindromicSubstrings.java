package lc.dp.m;

public class PalindromicSubstrings {
    // SC: O(1)
    int result = 0;
    public int countSubstrings(String s) {
        // TC: O(n)
        for(int start=0; start<s.length(); start++){
            expand(s,start,start);
            expand(s,start,start+1);
        }
        return result;
    }
    private void expand (String s, int start, int end){
        // TC: O(n)
        while (start>=0 && end <s.length() && s.charAt(start) == s.charAt(end)){
            result++;
            start--;
            end++;
        }
    }


    public static void main(String[] args) {
        var ps = new PalindromicSubstrings();
        String s = "aaa";
        System.out.println(ps.countSubstrings(s));
    }
}
