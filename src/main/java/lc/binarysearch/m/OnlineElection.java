package lc.binarysearch.m;

public class OnlineElection {
    // overall O(n) O(n)
    private int n;
    private int[] times, winner;
    public OnlineElection(int[] persons, int[] times) {
        this.n = persons.length;
        this.times = times;
        this.winner = new int[n];
        calc_winner(persons);
    }
    // O(n) O(n)
    private void calc_winner(int[] persons) {
        int[] votes = new int[n];
        int max_vote = 0, curr_winner = -1;
        for(int i=0;i<n;i++){
            int p = persons[i];
            votes[p]++;
            if(curr_winner==-1 || max_vote <= votes[p]) {
                curr_winner = p;
                max_vote = votes[p];
            }
            winner[i] = curr_winner;
        }
    }
    // O (log n) O(1)
    public int q(int query) {
        int left = 0, right = n-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(query < times[mid])
                right = mid-1;
            else
                left = mid;
        }
        return winner[left];
    }

    public static void main(String[] args) {
        int[] persons = {0, 1, 1, 0, 0, 1, 0};
        int[] times = {0, 5, 10, 15, 20, 25, 30};
        OnlineElection election = new OnlineElection(persons, times);
        int[] queries = {3,12,25,15,24,8};
        for (int query : queries)
            System.out.println(election.q(query));
    }
}
