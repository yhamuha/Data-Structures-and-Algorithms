package lc.sorting.m;

public class MaxChunksToMakeSorted {
    // O(n) O(1)
    public int maxChunksToSorted(int[] arr) {
        int count =0;
        int prefixSum = 0;
        int idealSum =0;
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            idealSum += i;
            if(prefixSum == idealSum)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        MaxChunksToMakeSorted sorter = new MaxChunksToMakeSorted();
        int[] arr = {1, 0, 2, 3, 4};
        int result = sorter.maxChunksToSorted(arr);
        System.out.println(result);
    }
}


