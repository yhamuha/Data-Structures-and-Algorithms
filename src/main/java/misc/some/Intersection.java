package misc.some;

/**
 *
 */

public class Intersection {

    public static void main(String[] args) {
        int[] arr1 = {1,5,7,6};
        int[] arr2 = {1,2,3,7};

        intersectionOfTwoArray_MmultN(arr1,arr2);
    }

    // Time Complexity O(mn)
    static void intersectionOfTwoArray_MmultN (int[] arr1, int[] arr2){
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}






