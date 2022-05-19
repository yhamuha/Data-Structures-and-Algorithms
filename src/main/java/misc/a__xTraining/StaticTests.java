package misc.a__xTraining;

/**
 *
 */
class StaticSuper {
    static {
        System.out.println("super static block");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 10);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args){
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}


