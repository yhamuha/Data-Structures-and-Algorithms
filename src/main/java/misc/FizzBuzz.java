package misc;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 20;
        for(int i=1; i<=n; i++) {
            // divisible by 15 print FizzBuzz
            if (i%15 == 0) System.out.print("FizzBuzz" + " ");
            // divisible by 5 print Fizz
            else if (i%5 == 0) System.out.print("Fizz" + " ");
            // divisible by 3 print Buzz
            else if (i%3 == 0) System.out.print("Buzz" + " ");
            else System.out.print(i + " ");
        }
    }
}

