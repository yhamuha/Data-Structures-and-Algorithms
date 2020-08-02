package misc;
/**
 * app to check whether string
 * contains some digits
 */
public class StringContainsDigits {

    /**
     * The entry point of application:
     * - create string
     * - matching using regexp
     * @param args the input arguments do no using
     */
    public static void main(String []args) {
        String str = "testString2020";
        System.out.println("String: "+str);
        if(str.matches("[0-9]+") && str.length() > 2) {
            System.out.println("String contains only digits!");
        } else {
            System.out.println("String contains digits as well as other characters!");
        }
    }
}
