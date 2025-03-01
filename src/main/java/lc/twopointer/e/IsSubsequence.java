package lc.twopointer.e;

public class IsSubsequence {
    // O(m+n) O(1)
    static boolean isSubsequence(String s, String t) {
        int p1=0, p2=0;
        int n1 = s.length(), n2=t.length();
        int common = 0;
        for(int i=0; i<n2; i++){
           if (p1<n1 && p2<n2 && common!=n1){
               if (s.charAt(p1) == t.charAt(p2)) {
                   common++;
                   p1++;
               }
           }
           p2++;
        }
        return common==n1;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
