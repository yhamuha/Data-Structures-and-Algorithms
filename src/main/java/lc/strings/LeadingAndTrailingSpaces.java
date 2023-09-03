package lc.strings;


public class LeadingAndTrailingSpaces {

    public static void main(String[] args) {
        String text = "\n \n\n hello \t \n \r";
        String text1 = " ferry of ";
        // String trimmed = text1.trim();

        // jdk 11
        String trimmed = text1.stripTrailing();
        System.out.println(trimmed);
    }




}
