package misc;


public class TriangleOutput {

//    public static void main(String[] args) {
//
//        for(int i=1; i<=6; i++) {
//
//            // write a numbers
//            for (int j=1; j<=i; j++) {
//                System.out.print(j);
//            }
//
//            //write a stars
//            for(int k=6;k>i;k--) {
//                System.out.print("*");
//            }
//
//            // go to the next line
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {

//        for (int i=6; i>=1;i--) {
//
//            // write a numbers
//            for (int j=1; j<i; j++) {
//                System.out.print(" " +j);
//            }
//
//            // write a other symbol
//            for(int k=6; k>=i; k--) {
//                System.out.print(" &");
//            }
//
//            // got o next line
//            System.out.println();
//        }

//        for (int i=6; i>1; i--) {
//
//            // numbers
//            for (int j=1; j<i; j++){
//                System.out.print(" " + j);
//            }
//
//            // sign
//            for (int k=6; k>=i; k--) {
//                System.out.print(" &");
//            }
//
//            // got to the next line
//            System.out.println();
//
//
//
//        }

        System.out.println("@");

        for (int i=5; i>=1; i--) {
            System.out.print("@");
            for (int j=5; j>=i;j--){
                System.out.print(" ");
            }
            System.out.println("@");
        }

        for(int j=1; j<=5; j++) {
            System.out.print("@ ");
        }

    }
}
