package misc.is.java.iterationAssignment4;

public class ArmstrongNumber {

    static boolean isArmstrongNumber (int num) {
        int temp = num;
        int numLength = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit,numLength);
            num /= 10;
        }

        return (sum == temp);
    }

    public static void main(String[] args) {
        int num1 = 371;
        int num2 = 1635;
        System.out.println(num1 + " is an Armstrong number: " + isArmstrongNumber(num1));
        System.out.println(num2 + " is an Armstrong number: " + isArmstrongNumber(num2));
    }
}
