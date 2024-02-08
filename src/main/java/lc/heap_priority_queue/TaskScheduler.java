package lc.heap_priority_queue;

import java.util.*;

public class TaskScheduler {
    // TC: O(n log n)
    public int leastInterval(char[] tasks, int n) {
        // SC: O(n)
        Map<Character, Integer> map = new HashMap<>();
        for(char task : tasks)
            map.put(task, map.getOrDefault(task,0)+1);

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b-a);
        heap.addAll(map.values());

        int cycle = 0;
        while(!heap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<n+1; i++) {
                if(!heap.isEmpty())
                    temp.add(heap.poll());
            }
            for(int i=0; i<temp.size(); i++){
                if (temp.get(i)-1 > 0)
                    heap.offer(temp.get(i)-1);
            }
            cycle += heap.isEmpty() ? temp.size() : n+1;
        }
        return cycle;
    }

    public static void main(String[] args) {
        var ts = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(ts.leastInterval(tasks,n));
    }
}
