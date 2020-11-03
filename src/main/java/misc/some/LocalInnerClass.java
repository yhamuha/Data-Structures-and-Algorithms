package misc.some;

/**
 *
 */
public class LocalInnerClass {

    static int i = 0;
    int j = 0;

    void does() {

        // class only internal here
        class Local {
            final static int local_i = 0;
            int w = 0;

        }
        // create an instance here
        Local local = new Local();
    }


    public static void main(String[] args) {

    }
}
