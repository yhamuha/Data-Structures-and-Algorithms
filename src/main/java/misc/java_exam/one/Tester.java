package misc.java_exam.one;

/**
 *
 */
public class Tester {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.method(3);
    }
}

class Base {
    public void method (int a){
        System.out.println("base method");
    }
}

class Derived extends Base{
    public void method() {
        System.out.println("derived method");
    }
}
