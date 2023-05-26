package misc.java_exam.three;

/**
 *
 */
public class TestGeneric {

    public <T> void printArray(T[] list) {
        for (int i = 0; i< list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Integer[] arrInteger = {10, 20, 30, 40, 50, 60};
        Character[] arrChar = {'I', 'N', 'F', 'O', 'S', 'Y', 'S'};
        Double[] arrDouble = {100.1, 200.1, 300.1};
        TestGeneric tg = new TestGeneric();
        tg.printArray(arrInteger);
        tg.printArray(arrChar);
        tg.printArray(arrDouble);
    }
}
