package lc.graphs.m;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    // O(V+E) O(V+E) #amazon
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>(numCourses) ;
        for(int i =0; i< numCourses;i++)
            adjList.add(new ArrayList<>());
        int[] inDegree = new int[numCourses];
        int[] ordering = new int[numCourses];
        buildAdjListAndInDegree(adjList, inDegree, prerequisites);
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i] == 0){
                que.add(i);
            }
        }
        int count=0;
        while(!que.isEmpty()){
            Integer node = que.remove();
            List<Integer> neighbors = adjList.get(node);
            for(int i=0; i<neighbors.size();i++){
                int neigbor = neighbors.get(i);
                inDegree[neigbor]--;
                if(inDegree[neigbor]== 0){
                    que.add(neigbor);
                }
            }
            ordering[count] = node;
            count++;
        }
        if(count!=numCourses)return new int[]{};
        return ordering;
    }
    private void buildAdjListAndInDegree(List<List<Integer>> adjList, int[] inDegree,
                                         int[][] prerequisites){
        for(int i=0; i<prerequisites.length;i++){
            int[] prerequisite = prerequisites[i];
            adjList.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]]++;
        }
    }
    public static void main(String[] args) {
        CourseScheduleII courseScheduleII = new CourseScheduleII();
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3,2}};
        int[] order = courseScheduleII.findOrder(numCourses, prerequisites);
        if (order.length > 0) {
            for (int course : order) {
                System.out.print(course + " ");
            }
        }
    }
}
