package misc.problem_solving;

/**
 *
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    static String freqAlphabets(String s) {

        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c.length; i++) {
            // do not go to end of array && check for # exists
            sb.append((i+2 < c.length && c[i+2] == '#') ?
                    // if true
                    (char)(Integer.parseInt(s.substring(i, i+=2))+96) :
                    // otherwise
                    (char)(Character.getNumericValue(c[i])+96));
        }

        return sb.toString();
    }
}
