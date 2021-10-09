package misc.kiteshoolalgorithms.sort;

public class BubbleSorting {
    public static void main(String[] args) {

        // Sort
        // Bubble - -the most "light" integers go to the left
        // O(n^2) O(1)

        int[] arr = {12, 2, 12, 3, 1};

        for (int i=0; i<arr.length-1; i++){
            for (int j=arr.length-1; j>i; j--){
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
        for (int number : arr){
            System.out.println(number);
        }

    }
}
