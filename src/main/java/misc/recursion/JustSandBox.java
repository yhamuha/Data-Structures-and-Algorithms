package misc.recursion;

/**
 * This {@code JustSandBox} is just sand box for some regular examples
 */
public class JustSandBox {

    /**
     *
     * @param args  the command line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(printWithCommasAndDot("345266"));

    }

    /**
     *
     * @param str   input string
     * @return      elements of string separated commas and dot at the end
     */
    static String printWithCommasAndDot (String str) {

        char[] charArray = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (i >= charArray.length-1) {
                stringBuilder.append(charArray[i]).append("."); break;
            }
            stringBuilder.append(charArray[i]).append(",");
        }

        return stringBuilder.toString();
    }
}
