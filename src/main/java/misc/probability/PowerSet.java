package misc.probability;

import java.util.ArrayList;

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

    /**
     * generate power set fro a given set
     * @param set   given set
     * @return  powerSet as ArraylList<int[]>
     */
    ArrayList<int[]> generatePowerSet (int[]set) {
        ArrayList<int[]> powerSet = new ArrayList<>();
        powerSet.add(new int[0]);

        for (int element : set) {
            for (int j = 0, l = powerSet.size(); j < l; j++) {
                int[] powerSubSetExtended = cloneAndExtend(powerSet.get(j), element);
                powerSet.add(powerSubSetExtended);
            }
        }
        return powerSet;
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
