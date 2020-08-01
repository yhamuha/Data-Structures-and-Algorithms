package misc;

import java.lang.*;

/** Class of ReverseString
 *  Java program to ReverseString using StringBuilder
 */
class ReverseStringBuilder
{
    public static void main(String[] args)
    {
        String input = "Real things";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}

