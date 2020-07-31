package misc;

/**
 * reverse string
 * using ByteArray
 */
import java.lang.*;

// Class of ReverseString
class ReverseString {

    /**
     * entry point
     * @param args the input arguments do no using
     */
    public static void main(String[] args)
    {
        String input = "RightWay";

        // getBytes() : convert string into bytes[].
        byte [] strAsByteArray = input.getBytes();

        byte [] result = new byte [strAsByteArray.length];

        // store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }
}

