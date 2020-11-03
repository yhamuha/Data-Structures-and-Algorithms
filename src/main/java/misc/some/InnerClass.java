package misc.some;

/**
 *
 */
public class InnerClass {

    static int i = 0;
    int j = 0;

    // we can instanciate class here
    // Inner inner = new Inner();

    class Inner {
        // full access to class variables
        // static or non static
        int a = i;
        int b = j;

        // methods works with this vars as well
    }

    public static void main(String[] args) {

        InnerClass innerClass = new InnerClass();
        // or have a instance like that
        Inner inner = innerClass.new Inner();

    }
}
