package misc.problem_solving;

/**
 *
 */
public class RichestMan2dArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{1,2,5}};
        System.out.println(maximumWealth2(array));
    }
    // O(n^2)
    static int maximumWealth(int[][] accounts) {
        int sum[] = new int[accounts.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++)
        {
            for(int j = 0;j<accounts[i].length;j++)
            {
                sum[i] = sum[i] +accounts[i][j];
            }
        }
        for(int i = 0;i<sum.length;i++)
        {
            if(sum[i]>max)
            {
                max = sum[i];
            }
        }
        return max;
    }

    // best approach
    // O(mn), O(1)
    static int maximumWealth2(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {

            int total = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }

            max = Math.max(max, total);

        }

        return max;
    }
}
