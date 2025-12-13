import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
class Solution {
   

    public List<Integer> eventualSafeNodes(int[][] graph) {
       int V = graph.length;
       List<List<Integer>> adjRev = new ArrayList<>();
       for (int i = 0; i < V; i++) {
        adjRev.add(new ArrayList<>());
       }
       int inDegree[] = new int[V];
       for (int i = 0; i < V; i++) {
        for (int it : graph[i]) {
            adjRev.get(it).add(i);
            inDegree[i]++;
        }
       }
       Queue<Integer> q = new LinkedList<>();
       for (int i = 0; i < V; i++) {
        if (inDegree[i]==0) {
            q.add(i);
        }
       }
       List<Integer> safeNodes = new ArrayList<>();
       while (!q.isEmpty()) {
        int node = q.poll();
        safeNodes.add(node);
        for (int it : adjRev.get(node)) {
            inDegree[it]--;
            if (inDegree[it]==0) {
                q.add(it);
            }
        }
       }
       Collections.sort(safeNodes);

       return safeNodes;
    }
}

public class FindEventualSafeState {
    

}
