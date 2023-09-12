package lc.other;

public class SumWithoutArithmeticOps {
        public static int sum(int a, int b) {
            // base point
            if (b == 0) {
                return a;
            }
            // XOR for partial sum
            int partialSum = a ^ b;
            // AND for carry
            int carry = (a & b) << 1;
            // handling recursively
            return sum(partialSum, carry);
        }

        public static void main(String[] args) {
            System.out.println(sum(1, 1));
            System.out.println(sum(5, 10));
            System.out.println(sum(100, 200));
            System.out.println(sum(3, 2));
        }
    }
