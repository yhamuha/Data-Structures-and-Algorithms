package misc.problem_solving;

/**
 *
 */
public class draw_shape {
    public static void main(String[] args) {

        for (int i=1; i<=6; i++){
            // draw digits
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            //draw symbols
            for(int k=6; k>i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
