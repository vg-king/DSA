// User function Template for Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
class Solution {
    void topoSort(int node,List<List<int[]>> adj,boolean[] visited,Stack<Integer>st){
        visited[node] = true;
        for (int[] i : adj.get(node)) {
            if (!visited[i[0]]) {
                topoSort(i[0], adj, visited, st);
            }
        }
        st.push(node);
    }
    public int[] shortestPath(int V, int E, int[][] edges) {
       List<List<int[]>> adj = new ArrayList<>();
       for (int i = 0; i < V; i++) {
        adj.add(new ArrayList<>());
       }
       for (int i = 0; i < E; i++) {
        int u = edges[i][0];
        int v = edges[i][1];
        int wt = edges[i][2];
        adj.get(u).add(new int[]{v,wt});
       }
       boolean[] visited =new boolean[V];
       Stack<Integer> stack = new Stack<>();
       for (int i = 0; i < V; i++) {
        if (!visited[i]) {
            topoSort(i, adj, visited, stack);
        }
       }
       int dist[] = new int[V];
       Arrays.fill(dist, (int)1e9);
       dist[0] =0;

       while (!stack.isEmpty()) {
        int node = stack.pop();
        if (dist[node]!= (int)1e9) {
            for (int []i : adj.get(node)) {
                int v = i[0];
                int wt = i[1];

                if (dist[node]+wt<dist[v]) {
                    dist[v] = dist[node]+wt;
                }
            }
        }
       }
       for (int i = 0; i < V; i++) {
        if (dist[i]==(int)1e9) {
            dist[i] =-1;
        }
       }
       return dist;
    }
}
public class ShortestpathinDirectedAcyclicGraph {
    
}
