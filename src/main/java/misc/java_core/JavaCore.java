package misc.java_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class JavaCore {

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
}
