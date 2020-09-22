package misc;

public class NumericPromotion {
    public static void main(String[] args) {


        // problem true for java, c#
        // because :
        // 0000 0001 -> 00000000 00000000 00000000 00000001

        // but we won't have an issue with c++, python

        short a = 1;
        // int a;
        short b = 1;
        // int b;

        // short c = a + b;
        short c = (short)(a + b);

        a++;
        // initially a is short
        // then int (a+1)
        // then (short) (int (a+1))

        System.out.println(c);

    }
}
