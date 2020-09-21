package misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionsFram {
    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//        Set list = new HashSet();
//
//        System.out.println(list.size());
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//            System.out.println(list.size());
//        }
//
//        list.add(4);
//        list.add(4);
//        list.add(4);
        //System.out.println(list.toString());

//        list.remove(5);
        //System.out.println(list.size());

//        float c = 1.9f - 1f;
//
//        System.out.println(c);
//        System.out.println(c);
//        System.out.println(c);
//        System.out.println(c);
//        System.out.println(c);
//
//        System.out.println(0.9f == 0.9f);
//        System.out.println(0.9f == 0.9f);
//        System.out.println(0.9f == 0.9f);
//        System.out.println(0.9f == 0.9f);
//        System.out.println(0.9f == 0.9f);

        byte b = 127; // 0111_1111
        byte value_127 = 0b0001;

        System.out.println(value_127);

        System.out.println(b>>2);


        int hexValue = 0x100;
        long hexValue2 = 0x100;
        double hexValue3 = 0x100;
        byte hexValue4 = (byte) 0x100;

        System.out.println(hexValue);
        System.out.println(hexValue2);
        System.out.println(hexValue3);
        System.out.println(hexValue4);

// Decimal declaration and possible chars are [0-9]
        int decimal    =  495;

// HexaDecimal declaration starts with 0X or 0x and possible chars are [0-9A-Fa-f]
        int hexa       =  0X1EF;

// Octal declaration starts with 0 and possible chars are [0-7]
        int octal      =  0757;

// Binary representation starts with 0B or 0b and possible chars are [0-1]
        int binary     =  0b111101111;

        int decimal1 = 757;
        int octal3 = 0757;
        System.out.println(decimal1 + " " + octal3);


    }
}
