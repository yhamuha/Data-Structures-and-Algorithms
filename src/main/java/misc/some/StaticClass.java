package misc.some;

/**
 *
 */
public class StaticClass {

    static int i = 0;
    int j = 0;


    static class InnerClass {
        static int a = i;
        // has a problem
        // static int b = j;

        // has a problem too
        // int b = j;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

    }
}
