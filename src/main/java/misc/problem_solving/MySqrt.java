package misc.problem_solving;

/**
 *
 */
public class MySqrt {
    public static void main(String[] args) {
        int x = 64;
        System.out.println(mySqrt(x));
//        System.out.println(Math.sqrt(x));
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.E);
//        System.out.println(Math.pow(Math.E, 0.5 * Math.log(64)));
    }

    static int mySqrt(int x) {
        if (x < 2) return x;
        // sqrt(x)
        int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
        System.out.println("sqrt: "+left);
        int right = left + 1;
        return (long)right * right > x ? left : right;
    }
}
