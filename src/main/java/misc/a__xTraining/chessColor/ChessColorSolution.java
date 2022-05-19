package misc.a__xTraining.chessColor;

/**
 *
 */
public class ChessColorSolution {
    public static void main(String[] args) {
        System.out.println(isWhite("a2"));
    }

    /**
     *   3  b w b w b w
     *   2  w b w b w b
     *   1  b w b w b w
     *      a b c d e f
     *
     *   "h3"
     *   charAt(0)
     *   ascii:
     *   a = even
     *   1 = even
     *   h - even 'a' = _ ; _ % 2 == 0; even or odd ;
     *   3 - even '1' = _ ; _ % 2 == 0; even or odd ;
     *   _ - even = odd ; odd % 2 (any odd) == 0;
     *
     *   ((charAt(0) - 'a') + (charAt(1) - '1')) % 2 != 0
     */

    private static boolean isWhite (String str) {
        return ((str.charAt(0)-'a') + (str.charAt(1)-'1')) % 2 !=0 ? true : false;


    }
}
