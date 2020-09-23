package misc;

public class Miscellaneous {
    public static void main(String[] args) {

        AddValuesToString();

    }

    // check the array elements and add to string some value
    // input:
    //          int[] array = {-1, 2, -3, 4, -5, 5};
    // output:
    //          .<><><>
    static void AddValuesToString () {
        String string = ".";
        boolean trigger = true;
        int[] array = {-1, 2, -3, 4, -5, 5};
        for (int i=0; i<array.length; i++ ) {
            if (array[i] > 0) {
                string += ">";
            } else {
                string += "<";
            }
        }
        System.out.println(string);
    }
}
