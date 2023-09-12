package lc.bitmanipulation;


// circular shift
public class RotateBits {
        private static final int BITS_IN_INTEGER = 32;
        public static int rotate(int x, int N) {
            N = N % BITS_IN_INTEGER;
            return (x >> N | x << (BITS_IN_INTEGER - N));
        }

        public static void main(String[] args) {
            System.out.println(rotate(0xFFFF0000, 8));
            System.out.println(rotate(0x13579BDF, 12));
            System.out.println(rotate(0b10110011100011110000111110000000, 17));
        }
    }
