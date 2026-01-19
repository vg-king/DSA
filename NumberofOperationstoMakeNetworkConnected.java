import java.util.ArrayList;

class Solution {
    void dfsGraph(int node,boolean vis[],int count,ArrayList<ArrayList<Integer>>adj){
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (vis[it]==false) {
                dfsGraph(it, vis, count, adj);
                count++;
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        int count = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < connections.length; i++) {
            adj.add(new ArrayList<>());
        }
        for (int edge[] : connections) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[] = new boolean[adj.size()+1];
        vis[0] = true;
        dfsGraph(0, vis, count, adj);
        if (count<n-1) {
            return -1;
        }
        return n-count;

    }
}
public class NumberofOperationstoMakeNetworkConnected {
    
}
