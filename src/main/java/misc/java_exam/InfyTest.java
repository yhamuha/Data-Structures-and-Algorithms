package misc.java_exam;

/**
 *
 */
public class InfyTest {
    public static void main(String[] args) {
////        int num1=0,num2=1,num3=-1;
//        int x,y,z;
////        System.out.println(num1 + num2 + num3);
//        System.out.println(x + y + z);

        String value1 = "Hello";
        String value2 = new String("Hello");
        System.out.println(value1 == value2);
        String value3 = value2.intern();
        System.out.println(value1 == value3);

    }
}
