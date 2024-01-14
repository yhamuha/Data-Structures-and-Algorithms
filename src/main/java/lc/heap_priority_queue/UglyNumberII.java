package lc.heap_priority_queue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumberII {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long>pq= new PriorityQueue<Long>();
        pq.add(1l);
        n=n-1;
        while(n>0){
            long a=pq.poll();
            if(!pq.contains(a*2))
                pq.add(a*2);
            if(!pq.contains(a*3))
                pq.add(a*3);
            if(!pq.contains(a*5))
                pq.add(a*5);
            n--;
        }
        long ans=pq.poll();
        return (int)ans;
    }

    public static void main(String[] args) {
        var unII = new UglyNumberII();
        int n = 10;
        System.out.println(unII.nthUglyNumber(n));
    }
}
