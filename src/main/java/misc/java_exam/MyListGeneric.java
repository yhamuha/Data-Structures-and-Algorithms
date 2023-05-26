package misc.java_exam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MyListGeneric {
    public static void displayElements (List<? super Integer> li) {
        System.out.println(li);
    }

    public static void main(String[] args) {
        List<Number> i1 = new ArrayList<>();
        i1.add(1009.9f);
        i1.add(200);
        i1.add(new Double(300));
        displayElements(i1);
    }
}
