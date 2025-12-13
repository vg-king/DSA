import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       
            List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        int inDegree[] = new int[numCourses];

        for (int pre[] : prerequisites) {
            int course = pre[0];
            int req = pre[1];
            adj.get(req).add(course);
            inDegree[course]++;
        }
  

       
       Queue<Integer> queue = new LinkedList<>();
       for (int i = 0; i < numCourses; i++) {
        if (inDegree[i]==0) {
            queue.add(i);
        }
       }
       int topo[] = new int[numCourses];
       int i=0;
       while (!queue.isEmpty()) {
        int node  = queue.peek();
        queue.remove();
        topo[i++]=node;
        for (int it : adj.get(node)) {
            inDegree[it]--;
            if (inDegree[it]==0) {
                queue.add(it);
            }
        }
       }
       if (i==numCourses) {
        return topo;
       }
       return new int[0];
    }
}
public class CourseSchedule_2 {
    
}
