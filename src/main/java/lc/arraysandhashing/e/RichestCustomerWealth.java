package lc.arraysandhashing.e;

public class RichestCustomerWealth {
    // O(n*m) O(1)
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        for(int i=0; i<accounts.length; i++){
            int customer_amount=0;
            for(int j=0; j<accounts[i].length; j++)
                customer_amount += accounts[i][j];
                if(customer_amount > max_wealth)
                    max_wealth = customer_amount;
        }
        return max_wealth;
    }

    public static void main(String[] args) {
        RichestCustomerWealth solution = new RichestCustomerWealth();
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
        };
        System.out.println(solution.maximumWealth(accounts));
    }
}
