package misc.problem_solving;

/**
 *
 */
public class empty_triangle {
    public static void main(String[] args) {
        for (int init=1; init<=8; init++) {

            if (init == 7 || init == 8) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=6; i>=1; i--){

            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("#");

            for(int k=6; k>=i; k--) {
                System.out.print(" ");
            }

            for(int k=6; k>=i; k--) {
                System.out.print(" ");
            }

            System.out.print("#");
            System.out.println();
        }
        for(int k=7; k>=0; k--){
            System.out.print("# ");
        }
    }
}
