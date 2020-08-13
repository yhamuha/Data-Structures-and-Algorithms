package misc;

import java.util.Scanner;

public class SecondLastDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, c1, c2;
        System.out.println("Enter a number");
        n=in.nextInt();

        if(n>99)
        {
            c1=n%100;
            c2=c1/10;
            System.out.println("The second last digit of the number is = "+c2);
        }
        else {
            System.out.println("The second last digit of the number is = "+(n/10));
        }
    }

}
