package misc.problem_solving;

/**
 *
 */
public class rectangle {
    public static void main(String[] args) {

        for(int i=6; i>=1; i--){
            // draw empty part
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            // draw filled first part
            for(int k=6; k>=i; k--) {
                System.out.print("*");
            }
            // draw filled second part
            for(int k=6; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
