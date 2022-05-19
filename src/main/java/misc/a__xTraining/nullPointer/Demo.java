package misc.a__xTraining.nullPointer;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        int x;
        x = 10;

        Integer num;
        num = new Integer(10);

        Object obj = null;
        obj.hashCode();
    }

}
