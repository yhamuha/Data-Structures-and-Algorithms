package misc.some;

/**
 *
 */
public class PrefixPostfixIncrement {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(++i == i++); //(0) 1 == 1(2) true
        System.out.println(i++ == i++); // 2(3) == 3(4) false
    }
}
