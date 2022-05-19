package misc.a__xTraining;

/**
 *
 */

class Parent2  {

    static {
        System.out.println("parent static block");
    }
    Parent2() {
        System.out.println("parent constructor");
    }

    {
        System.out.println("parent init block1");
    }
    {
        System.out.println("parent init block2");
    }
}

public class InitExample extends Parent2 {
    static {
        System.out.println("child static block");
    }

    {
        System.out.println("child init block");
    }

    InitExample() {
        //super();
        System.out.println("child constructor");
    }
    public static void main(String[] args) {
        new InitExample();
    }

    {
        System.out.println("child init block");
    }
}


//        parent static block
//        child static block

//        parent init block1
//        parent init block2

//        parent constructor

//        child init block
//        child init block
//        child constructor