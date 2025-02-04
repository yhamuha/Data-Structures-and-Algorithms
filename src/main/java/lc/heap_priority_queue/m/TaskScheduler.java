package lc.heap_priority_queue.m;

import java.util.*;

public class TaskScheduler {
    // O(n log k) O(1)
    static int leastInterval(char[] tasks, int n) {
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
    // O(n log n) O(1)
    static int leastInterval_arr(char[] tasks, int n) {
        int[] char_map = new int[26];
        for(char c : tasks)
            char_map[c-'A']++;
        Arrays.sort(char_map);
        int max_val=char_map[25]-1;
        int idle_slots = max_val * n;
        for(int i=24; i>=0; i--)
            idle_slots -= Math.min(char_map[i], max_val);
        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks,n));
    }
}
