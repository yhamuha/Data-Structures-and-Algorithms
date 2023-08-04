package cs.bitmanipulations;

public class BitManipulations {

    int getLowestBit(int data) {
        return data & 1;
    }

    // for byte, short, long -> 7, 15 and 63 respectively
    int getHighestBit (int data) {
        return data >>> 31;
    }

    void lowToHigh(int bits) {
        int data = bits;
        for (int i = 0; i < 32; i++) {
            int bit = getLowestBit(data);
            System.out.print(bit);
            data = data >>> 1;
        }
    }

    void highToLow(int bits) {
        int data = bits;
        for (int i=0; i<32; i++) {
            int bit = getHighestBit(data);
            System.out.println(bit);
            data = data << 1;
        }
    }
}
