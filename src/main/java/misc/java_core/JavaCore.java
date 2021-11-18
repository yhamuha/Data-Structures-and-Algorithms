package misc.java_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class JavaCore extends Thread {

    // List is dynamic
    /*public static void main( String[] args ) {
        List list = new ArrayList( 3 ); //1

        list.add( new Integer( 100 ) );
        list.add( new Integer( 200 ) );
        list.add( new Integer( 300 ) );
        list.add( new Integer( 400 ) ); //2

        System.out.println( list.size() ); //3
    }

    >> 4
    */

    // array.add (index, elem)
   /* public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(2);
        array.add(5);
        array.add(6);
        array.add(0, 7);
        System.out.println(array);
        System.out.println("6st: " +array.indexOf(6));

        array.remove(1);
        System.out.println(array);
        System.out.println("6st: " + array.indexOf(6));
    }*/

    // have access to private method other instance from the same class
    /*private int getX() {
        return 5;
    }

    public int get2X() {
        return 2 * getX();
    }

    public static void main(String[] args) {
        JavaCore jc = new JavaCore();
        System.out.println(2 * jc.getX());
    }*/

    // remove return from finally
    /*public static void main(String... args) {
        System.out.println("" + new JavaCore().summ(3, 3));
    }

    public int summ(int a, int b) {
        try {
            return a + b;
        } finally {
            if (a == b)
                return 0;
        }
    }*/

    // automatically change type from int to byte
    /*public static void main(String[] s) {
        byte b = 8;
        m(b);
        m(7);
    }

    static void m(byte b) {
        System.out.print("byte");
    }*/

    // nested if else
    /*public static void main(String...args) {
        boolean b = false;
        if (b == false)
            if (b = false)
                System.out.println("if statement");
            else
                System.out.println("else 1");
        else
            System.out.println("else 2");
    }*/

   // by def equals compare references; == too
   // with @override equals compare obj internals
   /* public static void main(String[] args) {
        V v1 = new V("abc");
        V v2 = new V("abc");
        System.out.println((v1 == v2) + " " + v1.equals(v2));
        }
    }*/

    /*class V {
        String s = null;

        V(String str){
            this.s = str;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            V v = (V) o;
            return s != null ? s.equals(v.s) : v.s == null;
        }
   */

    // separate thread in main

    /* !! here field x is not volatile */
    /*private int x = 2;

    public static void main(String[] args) throws Exception {
        new JavaCore().makeItSo();
    }

    public JavaCore() {
        x = 5;
        start();
    }

    public void makeItSo() throws Exception {
        join();
        x = x - 1;
        System.out.println(x);
    }

    public void run() { x *= 2; }*/

    /* result will be 9 */

}
