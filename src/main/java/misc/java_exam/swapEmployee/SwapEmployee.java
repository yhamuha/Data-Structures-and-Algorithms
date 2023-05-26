package misc.java_exam.swapEmployee;

/**
 *
 */
public class SwapEmployee {
    public <T> void swap (T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        for (T t : a) {
            System.out.println(t + "");
        }
    }
}

class Starter {
    public static void main(String[] args) {
        SwapEmployee obj = new SwapEmployee();
        Integer[] empIdList = {101,102,100,104};
        obj.swap(empIdList, 1, 2);
    }
}
