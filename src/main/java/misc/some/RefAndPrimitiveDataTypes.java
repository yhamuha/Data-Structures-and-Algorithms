package misc.some;

/**
 *
 */
public class RefAndPrimitiveDataTypes {

    public static void main(String[] args) {

        // Integer is immutable
        // we can't put by reference correctly

        Integer valueInt = 1;
        RefAndPrimitiveDataTypes.change(valueInt);

        System.out.println(valueInt);
        // output: 1
    }

    public static void change (Integer value) {
        value++;
    }

}
