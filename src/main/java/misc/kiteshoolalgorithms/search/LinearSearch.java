package misc.kiteshoolalgorithms.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,2,7,8,1,1,3,4,5,1,1};

        int search = 1;


        /*
        *   Linear Search
        * */

        for (int i=0; i<=arr.length-1;i++){
            if (arr[i]==search) {
                System.out.println(i);
            }
        }



    }
}
