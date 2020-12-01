package misc.some;

/**
 *
 */

public class Intersection {


    public static void main(String[] args) {
        int[] arr1 = {1,5,6,7};
        int[] arr2 = {1,2,3,7};

        intersectionOfTwoArray_MmultN(arr1,arr2);
        intersectionOfTwoArray_MPlusN(arr1, arr2);
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

    // Complexity O(m+n)
        static void intersectionOfTwoArray_MPlusN (int[] arr1, int[] arr2){
            int i = 0;
            int j = 0;

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
                i++;
                j++;
            }
        }


    }






