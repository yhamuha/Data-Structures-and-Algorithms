package misc.a__xTraining.chessColor;

public class ChessboardColor {
    public static void main(String[] args) {
        String coordinates = "c2";
        System.out.println(squareIsWhite(coordinates));
    }


    static boolean squareIsWhite(String coordinate) {

        return ((coordinate.charAt(0) - 'a') + (coordinate.charAt(1) - '1'))
                    % 2 != 0 ? true : false;
    }
}