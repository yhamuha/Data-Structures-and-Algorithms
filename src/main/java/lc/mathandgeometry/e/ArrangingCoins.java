package lc.mathandgeometry.e;

public class ArrangingCoins {
    // O(log n) O(1)
    static int arrangeCoins(int n) {
        int i = 1, filledRow = 0;
        while (i < n){
            n -= i;
            filledRow++;
            if(n < 0)
                break;
            i++;
        }
        return filledRow;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
}
