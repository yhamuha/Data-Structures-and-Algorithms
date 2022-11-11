package misc.core;

/**
 *
 */
public class StringArrayExample {
    public static void main(String[] args) {
        String[] strs = {"one", "two", "three", "four"};
        int i = -1;
        for(String str : strs ) {
            i++;
            System.out.printf("String array %d : %s \n", i, str);

        }
    }

}
