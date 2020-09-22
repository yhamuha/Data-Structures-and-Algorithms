package misc;

public class RetrieveMaxElementFromArray{
    public static void main(String[] args) {
        int[] array = {1,5,3,8,9,11,30,10,9};
        System.out.println(MaxElementOfArray(array));
    }

    private static int MaxElementOfArray (int[] array) {

        int max = 0;

        for (int i=1; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
