package misc.problem_solving;/**
 *
 */
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indicies = {4,5,6,7,0,2,1,3};
        System.out.println(shuffleString2(s, indicies));
    }

    // O(n), O(n)
    static String shuffleString2(String s, int[] indices){
        char[] c1 = new char[s.length()];
        for(int i=0;i<s.length();i++){

            c1[indices[i]] = s.charAt(i);

        }
        String str = String.valueOf(c1);
        return str;
    }
}
