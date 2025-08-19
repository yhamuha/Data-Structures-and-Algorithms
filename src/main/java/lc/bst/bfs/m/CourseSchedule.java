package lc.bst.bfs.m;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    // O(V+E) O(V+E) #amazon
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());
        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];
            graph.get(prereq).add(course);
            inDegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            if (inDegree[i] == 0) queue.offer(i);
        int visited = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited++;
            for (int neighbor : graph.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }
        return visited == numCourses;
    }

    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(cs.canFinish(numCourses1, prerequisites1));
        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println(cs.canFinish(numCourses2, prerequisites2));
    }
}
