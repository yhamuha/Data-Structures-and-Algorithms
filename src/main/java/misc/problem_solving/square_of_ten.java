package misc.problem_solving;

/**
 *
 */
public class square_of_ten {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++) {
            System.out.print(".");
        }
        System.out.println();
        for (int j=1; j<=2; j++) {
            for(int i=1; i<=10; i++) {
                if (i == 1) {
                    System.out.print(".");
                }
                System.out.print(" ");
                if (i == 8) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=10; i++) {
            System.out.print(".");
        }
    }
}
