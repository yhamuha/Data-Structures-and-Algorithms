package misc.some;

/**
 * parameters transfer everywhere:
 * input, return
 */
public class ArrayReturn {

    private int[] values;

    public int[] sort(int[] values) {
        this.values = values;
        // return copy
        return values;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {

        ArrayReturn arrayReturn = new ArrayReturn();
        final int[] immutable = {1};
        // put reference copy of immutable
        final int[] ri = arrayReturn.sort(immutable);
        // all manipulation before was as references
        ri[0] = -1;
        arrayReturn.echo();
    }
}
