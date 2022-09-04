package misc.eScience_2022.B_bitwise;

public class BitwiseOperations {
    public static void main(String[] args) {
    int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
    System.out.println(findNumber(arr));
    int a = 29, b = 15;
    System.out.println(countBits(a,b));
    }

    /* find single number in stream */
    //xor will give us "1" for difference bits
    //    and "the same number" by xor to 0
    static int findNumber(int[] arr) {
        int number = arr[0];
        for (int i = 1; i < arr.length; i++)
            number = number ^ arr[i];
        return number;
    }

    // 29  00011101
    // 15  00001111
    // xor 00010010

    /* find bit differences */
    static int countBits(int a, int b) {
        // find different bits using xor
        int diffBits = a ^ b;
        int onesCount = 0;
        // go through all the bits
        // and count "1"'s
        while (diffBits != 0) {
            if ((diffBits & 1) == 1) onesCount++;
            diffBits = diffBits >>> 1;
        }
        return onesCount;
    }
}
