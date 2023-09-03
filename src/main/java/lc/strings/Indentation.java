package lc.strings;

import java.util.Arrays;
import java.util.List;

public class Indentation {
    public static void main(String[] args) {
        String days = "Sunday\n"
                + "Monday\n"
                + "Tuesday\n"
                + "Wednesday\n"
                + "Thursday\n"
                + "Friday\n"
                + "Saturday";
        // JDK 12
        System.out.println(days.indent(10));

        List<String> days2 = Arrays.asList("Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday");
        for (int i = 0; i < days2.size(); i++) {
            System.out.print(days2.get(i).indent(i));
        }
    }


}
