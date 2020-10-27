package misc.some;

public class ChildParentMethodOverloading {

    /**
     * Overloaded method 1
     * @param parent
     */
    void method (Parent parent){
        System.out.println("Parent");
    }

    /**
     * Overloaded method 2
     * @param child
     */
    void method (Child child){
        System.out.println("Child");
    }

    /**
     * driver method
     * @param args command line arguments (none)
     */
    public static void main(String[] args) {
        ChildParentMethodOverloading overl = new ChildParentMethodOverloading();
        overl.method(null);
    }
}

/**
 * Parent class
 */
class Parent {

}

/**
 * Child class
 */
class Child extends Parent {

}
