package misc.a__xTraining;

/**
 *
 */
public class Inheritance {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.ParentMethod());
    }
}


class Parent {

    int a = 5;

    public int ParentMethod() {
        System.out.println("methodOne");
        return 5;
    }
}
class Child extends Parent{

}
