package misc.a__xTraining.chessColor;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        String str = "a1";
        System.out.println( isWhite(str) );
    }

    static boolean isWhite (String str) {
        return (str.charAt(0) + str.charAt(1)) % 2 != 0 ? true : false;
    }
}
