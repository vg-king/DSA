import java.util.ArrayList;
class Solution {
    void dfsGraph(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);

        for (Integer it : adj.get(node)) {
            if (vis[it]==false) {
                dfsGraph(it, vis, adj, ls);
            }

        }
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[adj.size()+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfsGraph(0, vis,adj,ls);
        return ls;
        
    }
}
public class DFSGraph {
    
}
