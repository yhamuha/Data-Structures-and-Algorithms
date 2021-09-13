package misc.recursion;

/**
 *  The {@code Factorial} class represents
 *  a two different approach for implementation:
 *  - using loop;
 *  - using recursion;
 */
public class Factorial {

    /**
     * Main method.
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {

        // factorialUsingLoop
        factorialUsingLoop();

        // factorial using recursion
        int i,fact=1;
        //It is the number to calculate factorial
        int number=4;
        fact = factorialUsingRecursion(number);
        System.out.println("Factorial of "+number+" is (recurs): "+fact);
    }

    /**
     * calculate the factorial using loop
     * @return void
     */
    private static void factorialUsingLoop (){
        int i,fact=1;
        //It is the number to calculate factorial
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is (loop): "+fact);
    }

    /**
     * calculate the factorial using recursion
     * @param n int, factorial number to calculate
     */
    private static int factorialUsingRecursion (int n){
        if (n == 0)
            return 1;
        else
            return(n * factorialUsingRecursion(n-1));
    }

}
