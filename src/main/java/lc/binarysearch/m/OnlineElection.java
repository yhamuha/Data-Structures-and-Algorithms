package lc.binarysearch.m;

public class OnlineElection {
    // O(n log n) O(n)
    private int n;
    private int[] times, winner;
    public OnlineElection(int[] persons, int[] times) {
        this.n = persons.length;
        this.times = times;
        this.winner = new int[n];
        calc_winner(persons);
    }
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
    public int q(int t) {
        int l = 0, r = n-1;
        while(l<r){
            int mid = r+(l-r)/2;
            if(t < times[mid])
                r = mid-1;
            else
                l = mid;
        }
        return winner[l];
    }

    public static void main(String[] args) {
        int[] persons = {0, 1, 1, 0, 0, 1, 0};
        int[] times = {0, 5, 10, 15, 20, 25, 30};
        OnlineElection election = new OnlineElection(persons, times);
        System.out.println(election.q(3));
        System.out.println(election.q(12));
        System.out.println(election.q(25));
        System.out.println(election.q(15));
        System.out.println(election.q(24));
        System.out.println(election.q(8));
    }
}
