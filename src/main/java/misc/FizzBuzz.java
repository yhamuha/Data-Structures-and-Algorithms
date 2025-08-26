package misc;

public class FizzBuzz {
    // O(n) O(n) #ibm
    public String fizzBuzz(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if (i % 15 == 0) result.append("FizzBuzz");
            else if (i % 5 == 0) result.append("Buzz");
            else if (i % 3 == 0) result.append("Fizz");
            else result.append(i);
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        FizzBuzz example = new FizzBuzz();
        int n = 15;
        System.out.println(example.fizzBuzz(n));
    }
}

