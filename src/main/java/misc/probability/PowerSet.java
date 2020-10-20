package misc.probability;

/**
 * The {@code PowerSet} class contain function
 * to return power set from the set of elements
 */
public class PowerSet {

    /**
     * driver method
     * @param args the command line arguments (none)
     */
    public static void main(String[] args) {

    }

    int[] generatePowerSet (int[]arr) {

        return new int[0];
    }

    /**
     * clone and extend previous array
     * @param subset    given array
     * @param value     given value
     * @return          new cloned and extended array
     */
    int[] cloneAndExtend(int[] subset, int value) {
        // create
        int[] arrCopy = new int[subset.length + 1];
        // clone
        for (int i =0; i < subset.length; i++)
            arrCopy[i] = subset[i];
        // copy
        arrCopy[arrCopy.length-1] = value;
        // return
        return arrCopy;
    }
}
