package cs.bitmanipulations;

public class BitVector {

    int HDD = 1;
    int PRINT = 2;
    int SCREEN = 4;
    int NETWORK = 8;
    int EXDRIVE = 16;

    void processData(int flags) {
        if ((flags & HDD) != 0) System.out.println("HDD");
        if ((flags & PRINT) != 0) System.out.println("PRINT");
        if ((flags & SCREEN) != 0) System.out.println("SCREEN");
        if ((flags & NETWORK) != 0) System.out.println("NETWORK");
        if ((flags & EXDRIVE) != 0) System.out.println("EXDRIVE");
    }

    public static void main(String[] args) {
        BitVector bv = new BitVector();
        bv.processData(1);
    }
}
