package cs.bitmanipulations;

public class BitManipulations {

    int getLowestBit(int data) {
        return data & 1;
    }

    int getHighestBit (int data) {
        return data >>> 31;
    }
}
