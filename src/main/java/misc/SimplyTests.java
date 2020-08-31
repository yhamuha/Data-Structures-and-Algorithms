package misc;

public class SimplyTests {

    static int floatTest() {
        float num = 0.0f;
        int cx = 0;
        while (true) {
            if (num == 1.9f) {
                System.out.println("num equal 1.9");
                break;
            }
            num = num + 0.01f;
            cx++;
            System.out.println(cx);
        }
        return cx;
    }

    static void stringTest() {
        String str = "";
        int n =10;
        for (int i=1; i<=n; i++) {
            str +="a";
        }
        System.out.println(str);
    }


    public static void main(String[] args) {

        // infinity loop !
        // we couldn't reach 1.9f

        // SimplyTests.floatTest();

        // will have heavy load by RAM
        // Strings in java immutable

        //SimplyTests.stringTest();


    }
}