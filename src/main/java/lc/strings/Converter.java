package lc.strings;

public class Converter {
    private static final String WRONG_NUMBER = "234h";
    public static void main(String[] args) {

        try {
            Integer toIntWrong1 = Integer.valueOf(WRONG_NUMBER);
            System.err.println(toIntWrong1);
        } catch (NumberFormatException e) {
            System.err.println(e);

        }
        try {
            int toIntWrong2 = Integer.parseInt(WRONG_NUMBER);
            System.err.println(toIntWrong2);
        } catch (NumberFormatException e) {
            System.err.println(e);

        }
        try {
            String toString = String.valueOf(WRONG_NUMBER);
            System.err.println(toString);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}
