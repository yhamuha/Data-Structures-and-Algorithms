package misc.some;

/**
 *
 */
public class SequenceWithTheSameElement {
    public static void main(String[] args) {
        int[] array = {1,5,3,3,7,8,8,2};
        method(array);
    }

    static void method(int[] array){
        for (int i = 1; i<array.length; i++) {
            // prev elem equals current then the same sequence
            if (array[i-1] == array[i]) {
                System.out.println(array[i]);}
        }
    }
}