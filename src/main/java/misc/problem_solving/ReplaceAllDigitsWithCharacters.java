package misc.problem_solving;

/**
 *
 */
public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(replaceDigits2(s));
    }

    // O(n), O(1)
    static String replaceDigits(String s) {

        char c []= s.toCharArray();
        for(int i=0;i<c.length-1;i=i+2){

            c[i+1] = (char)(c[i] + Integer.parseInt(String.valueOf(c[i+1])));
        }

        return String.valueOf(c);
    }

    // O(n), O(1)
    static String replaceDigits2(String s) {
        char[] c = s.toCharArray();
        int i=0;
        while(i < c.length-1)
        {
            c[i+1]=(char)(c[i] + Character.getNumericValue(c[i+1]));
            i+=2;
        }
        return String.copyValueOf(c);
    }
}
