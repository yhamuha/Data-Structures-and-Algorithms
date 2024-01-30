package cs.dynamic;

public class CoinsChange {
    // recursion
    int getSplitWaysCount(int[] coins, int amount){
        if (amount <0) return 0;
        if (amount==0) return 1;
        int pathCount = 0;
        for(int i=0; i<coins.length;i++)
            pathCount += getSplitWaysCount(trimArray(coins,i), amount - coins[i]);
        return pathCount;
    }

    private int[] trimArray(int[] arr, int startIndex){
        int[] trimmedArray = new int[arr.length - startIndex];
        for(int i=startIndex; i< arr.length; i++)
            trimmedArray[i-startIndex] = arr[i];
        return trimmedArray;
    }

    public static void main(String[] args) {
        var cc1 = new CoinsChange();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(cc1.getSplitWaysCount(coins, amount));
    }
}
