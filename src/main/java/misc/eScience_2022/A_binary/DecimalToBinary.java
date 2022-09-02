package misc.eScience_2022.A_binary;

public class DecimalToBinary {

    public static void main(String[] args) {

        int dec = 5;

        // using Integer.toBinaryString()
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);

        // using custom logic
        decToBinary(dec);
    }

    static void decToBinary(int n)
    {
        int[] binaryNum = new int[32];

        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        // reverse output
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

}
