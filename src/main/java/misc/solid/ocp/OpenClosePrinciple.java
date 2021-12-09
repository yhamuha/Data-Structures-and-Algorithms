package misc.solid.ocp;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 *  we have to use
 *  1) interface
 *  2) particular class with own overrided method for particular role
 *
 *  in conclusion we will have efficient
 *  and ready for extent class
 */


public class OpenClosePrinciple {

    // driver method
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,4};
        ArrayUtil.sort(arr, new DscComparator());
        System.out.println("sorted values in array are:");
        for (int ele: arr) {
            System.out.println(ele);
        }
    }
}

// sort logic
class ArrayUtil {
    public static void sort(int a[], ValueComparator comparator) {
        for (int i =0; i< a.length; i++) {
            for (int j = i+1; j< a.length; j++) {
                if (comparator.compare(a[i], a[j]) > 0) {
                    int temp =  a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

interface ValueComparator {
    /**
     *
     * @return +ve if value1 > value 2, -ve if value1 < value2, 0 if value1 = value2
     */
    int compare (int value1, int value2);
}

class AscComparator implements ValueComparator {
    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}

class DscComparator implements ValueComparator {
    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}
