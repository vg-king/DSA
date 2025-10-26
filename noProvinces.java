import java.util.ArrayList;
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i); // optional, matrix is symmetric
                }
            }
        }

        int[] vis = new int[n];
        int count = 0;

        // Run DFS for each unvisited node
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, adj, vis);
            }
        }
        return count;
    }

    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[node] = 1;
        for (Integer i : adj.get(node)) {
            if (vis[i] == 0) {
                dfs(i, adj, vis); // fix: call dfs on i, not node
            }
        }
    }
}

public class noProvinces {
    
}
