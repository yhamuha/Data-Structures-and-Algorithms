package lc.bitmanipulation.m;

public class ReverseInteger {
    // O(log n) O(1)
    public int reverse(int x) {
       long result = 0;
       int lastDigit;
       while(x!=0){
           lastDigit=x%10; // get last digit
           result= result * 10 + lastDigit; // form result
           x=x/10; // form new number

           // check the constraints
           if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
       }
       return (int) result;
    }
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int num1 = 123;
        int num2 = -456;
        System.out.println("Reverse of " + num1 + " is: " + reverseInteger.reverse(num1));
        System.out.println("Reverse of " + num2 + " is: " + reverseInteger.reverse(num2));
    }
}
