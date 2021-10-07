package misc.problem_solving;

/**
 *
 */
public class ChessboardColor {
    public static void main(String[] args) {
     String coordinates = "h3";
        System.out.println(squareIsWhite3(coordinates));
    }

    static boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0)-'a'+1)+(coordinates.charAt(1)-'1'+1))%2!=0;
    }

    static boolean squareIsWhite2(String coordinates) {
        if(coordinates.isEmpty() || coordinates.length() != 2)
            return false;

        return ((coordinates.charAt(0) - 'a') + (coordinates.charAt(1) - '1')) % 2 != 0 ? true : false;

    }

    //
    static boolean squareIsWhite3(String coordinates) {
        char ch=coordinates.charAt(0);
        int x;
        switch(ch){
            case 'a':x=1;
                break;
            case 'b':x=2;
                break;
            case 'c':x=3;
                break;
            case 'd':x=4;
                break;
            case 'e':x=5;
                break;
            case 'f':x=6;
                break;
            case 'g':x=7;
                break;
            case 'h':x=8;
                break;
            default: x=10;
                break;

        }
        char nh=coordinates.charAt(1);
        int y=nh-'0';
        if((x+y)%2==0){
            return false;
        }
        return true;
    }
}
