package misc;


public class FindPreviousNumber {

    int rightBit(int num) {
        return 1 & num;
    }

    // time complexity O(N)
    // constant int = 32 bits in worst case iteration

    int[] getTrailingBitsCount(int num) {
        if (num<=0) return null;
        // quantity of zeroes
        int trailingZeroesCount = 0;
        // quantity of ones
        int trailingOnesCount = 0;

        while (rightBit(num) == 0) {
            trailingZeroesCount++;
            num = num >>> 1;
        }

        // check the end cases
        if (num ==0) return null;

        while (rightBit(num) ==0) {
            trailingZeroesCount++;
            num = num >>> 1;
        }
        return new int[] {
                trailingZeroesCount,
                trailingOnesCount
        };
    }

    // time O(1)
    int clearRightBits (int num, int count) {
        return(-1 << count) & num;
    }

    // time O(N)
    int setBits(int num, int start, int count) {
        return (((1<< count) - 1) << start) | num;
    }


}
