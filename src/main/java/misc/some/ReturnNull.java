package misc.some;

public class ReturnNull {
    public static void main(String[] args) {
        System.out.println(someMethod("str"));
    }

    static int someMethod (String s) {
        if (s.length() >= 10) return 0;
        return -1;
    }
}
