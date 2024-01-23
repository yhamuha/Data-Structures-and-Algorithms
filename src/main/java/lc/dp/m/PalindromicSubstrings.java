package lc.dp.m;

public class PalindromicSubstrings {
    int result = 0;
    // O(n^2) O(1)
    public int countSubstrings(String s) {
        // O(n)
        for(int i=0; i<s.length();i++){
            // O(n)
            count(s,i,i);
            count(s,i,i+1);
        }
        return result;
    }
    private void count(String s, int start, int end){
        while(start>=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
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
