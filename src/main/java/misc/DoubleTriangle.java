package misc;

public class DoubleTriangle {
        // O(1) O(1)
        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) System.out.print(" ");
                if (i == 3)
                    System.out.print("** **");
                else if (i == 5)
                    System.out.print("*********");
                else {
                    for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) System.out.print(" ");
                if (i == 3)
                    System.out.print("** **");
                else {
                    for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
                }
                System.out.println();
            }
        }
    }

