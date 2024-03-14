package misc.gl;

public class TwoStringsFromLetters {
    // O(max (n,m,k))
    public static String solve(String S1, String S2, String R){
        // O(1)
        int[] freq = new int[26];
        for(char c: R.toCharArray())
            freq[c-'A']++;

        for(char c: S1.toCharArray()){
            if (freq[c - 'A'] >0 )
               freq[c-'A']--;
            else
                return "No";
        }
        for(char c: S2.toCharArray()){
            if (freq[c - 'A'] >0 )
                freq[c-'A']--;
            else
                return "No";
        }
        for (int count : freq){
            if (count > 0)
                return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        String S1 = "ABC";
        String S2 = "DEF";
        String R = "ABCD";
        String result = TwoStringsFromLetters.solve(S1, S2, R);
        System.out.println(result);
    }
}
