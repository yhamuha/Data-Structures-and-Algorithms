package misc.problem_solving;/**
 *
 */
public class ShuffleString {
    public static void main(String[] args) {
        String s = "LIKE";
        int[] indicies = {1,0,3,2};
        System.out.println(shuffleString(s, indicies));
    }

    // O(n), O(n)
    static String shuffleString(String s, int[] indices) {

        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < indices.length; i++) {
           strBuf.append(s.charAt(indices[i]));
        }
        return strBuf.toString();
    }
}
