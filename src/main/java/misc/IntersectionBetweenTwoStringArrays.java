package misc;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionBetweenTwoStringArrays
{
    public static void main(String[] args)
    {
        String[] firstArray = {"A", "B", "C", "D"};
        String[] secondArray = {"D", "A", "E", "F"};

        HashSet<String> set = new HashSet<>();

        set.addAll(Arrays.asList(firstArray));

        set.retainAll(Arrays.asList(secondArray));

        System.out.println(set);

        String[] intersection = {};
        intersection = set.toArray(intersection);

        System.out.println(Arrays.toString(intersection));
    }
}
