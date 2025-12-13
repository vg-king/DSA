import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][2] == 0) {
               
            }
        }
        int[] dist = new int[grid.length];
        Arrays.fill(dist, (int) 1e9);
           dist[0] = 0;

         // Initialize queue for BFS
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        // BFS traversal
        while (!q.isEmpty()) {
            int node = q.poll();

            // Traverse neighbors
            for (int neighbor : adj.get(node)) {
                if (dist[node] + 1 < dist[neighbor]) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }

    }
}

public class ShortestPathInaBinaryMatrix {

}
