package misc.java_exam;

/**
 *
 */
public class Tester {
    public static void main(String[] args) {
        Base obj = new Derived();
        //obj.method();           // compilation error
    }
}

class Base {
    public void method (int a) {
        System.out.println("Base method");
    }
}

class Derived extends Base {
    public void method() {
        System.out.println("Derived method");
    }
}
