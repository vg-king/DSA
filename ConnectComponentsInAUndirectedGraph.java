import java.util.ArrayList;
class Solution {
    
    void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ls){
        vis[node] = true;
        ls.add(node);
        for (Integer integer : adj.get(node)) {
            if (!vis[node]) {
                dfs(integer, vis, adj, ls);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[V];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < vis.length; i++) {
            if (!vis[i]) {
                ArrayList<Integer> aj = new ArrayList<>();
                dfs(i, vis, adj, aj);
                ans.add(aj);
            }
        }
        return ans;
    }
}