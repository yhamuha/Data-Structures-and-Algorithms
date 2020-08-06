package misc;

    public class IsDigitIntegerParseInt {

        public static void main(String[] args) {

            String number = "-100";
            if (isDigit(number)) {
                System.out.println(Integer.parseInt(number));
            } else {
                System.out.println("Please provide a valid digit [0-9]");
            }

        }

        public static boolean isDigit(String input) {

            // null or length < 0, return false.
            if (input == null || input.length() < 0)
                return false;

            // empty, return false
            input = input.trim();
            if ("".equals(input))
                return false;

            if (input.startsWith("-")) {
                // negative number in string, cut the first char
                return input.substring(1).matches("[0-9]*");
            } else {
                // positive number, good, just check
                return input.matches("[0-9]*");
            }

        }

    }