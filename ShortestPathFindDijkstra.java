import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
class Solution {

    // ---------- Pair Class ----------
    static class Pair {
        int first;   // distance or weight
        int second;  // node

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // ---------- Shortest Path Function ----------
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {

        // Create adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }

        // Min-heap based on distance
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.first - y.first);

        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dist[i] = (int) 1e9;
            parent[i] = i;
        }

        dist[1] = 0;
        pq.add(new Pair(0, 1));   // (distance, node)

        while (!pq.isEmpty()) {
            Pair it = pq.poll();
            int dis = it.first;
            int node = it.second;

            for (Pair p : adj.get(node)) {
                int adjNode = p.first;
                int edgeW = p.second;

                if (dis + edgeW < dist[adjNode]) {
                    dist[adjNode] = dis + edgeW;
                    parent[adjNode] = node;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }

        // If last node unreachable
        if (dist[n] == (int) 1e9) {
            return Arrays.asList(-1);
        }

        // Build final path
        List<Integer> path = new ArrayList<>();
        int node = n;

        while (parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(1);

        Collections.reverse(path);
        return path;
    }
}

public class ShortestPathFindDijkstra {
    
}
