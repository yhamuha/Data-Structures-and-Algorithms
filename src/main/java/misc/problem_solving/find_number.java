package misc.problem_solving;


/**
 *
 */
public class find_number {
    public static void main(String[] args) {
    int[] arr = {5,5,6};
    System.out.println(findNumber(arr));

    int a = 29;
    int b = 15;

    System.out.println(countBits(a,b));

    int num = 25;
        System.out.println(pairwiseSwap(num));

    System.out.println(getBit(5,2));
    }
    //XOR
    static int findNumber(int[] arr) {
        int number = arr[0];
        for (int i = 1; i < arr.length; i++)
            number = number ^ arr[i];
        return number;
    }

    // XOR will return "1" for the different bits
    static int countBits(int a, int b) {
        int diffBits = a ^ b;
        int onesCount = 0;
        while (diffBits != 0) {
            // using >>> counting "1"
            if ((diffBits & 1) == 1) onesCount++;
            diffBits = diffBits >>> 1;
        }
        return onesCount;
    }

    // swap even and odd bits in given number
    static int pairwiseSwap(int num) {
        int oddMask = 0xAAAAAAAA;
        int evenMask = 0x55555555;

        oddMask = (num & oddMask);
        oddMask = oddMask >>> 1;

        evenMask = (num & evenMask);
        evenMask = evenMask << 1;

        return oddMask | evenMask;
    }

    // fast retrieving bit
    static int getBit (int data, int bit) {
        int _1u = 1;
        data = (data >> bit) & _1u;

        return data;
    }


}
