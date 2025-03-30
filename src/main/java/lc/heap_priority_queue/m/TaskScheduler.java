package lc.heap_priority_queue.m;

import java.util.*;

public class TaskScheduler {
    // O(n log n) O(n)
    static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char task : tasks)
            freqMap.put(task, freqMap.getOrDefault(task,0)+1);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        maxHeap.addAll(freqMap.values());
        int cycle = 0;
        while(!maxHeap.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            for(int i=0; i<n+1; i++) {
                if(!maxHeap.isEmpty())
                    tempList.add(maxHeap.poll());
            }
            for(int i=0; i<tempList.size(); i++){
                if (tempList.get(i)-1 > 0)
                    maxHeap.offer(tempList.get(i)-1);
            }
            cycle += maxHeap.isEmpty() ? tempList.size() : n+1;
        }
        return cycle;
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks,n));
    }
}
