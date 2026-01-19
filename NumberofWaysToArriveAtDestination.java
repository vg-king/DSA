import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    class Pair {
        int dist;
        int node;

        Pair(int dist, int node) {
            this.dist = dist;
            this.node = node;
        }
    }

    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] i : roads) {
            int u = i[0];
            int v = i[1];
            int wt = i[2];
            adj.get(u).add(new Pair(wt, v));
            adj.get(v).add(new Pair(wt, u));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        int dist[] = new int[n];
        Arrays.fill(dist, (int) 1e9);
        dist[0] = 0;
        int ways[] = new int[n];
        Arrays.fill(ways, 0);

        ways[0] = 1;
        pq.add(new Pair(0, 0));
        int mod = (int) (1e9 + 7);
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int d = p.dist;
            int node = p.node;
            if (d > dist[node]) {
                continue;
            }
            for (Pair it : adj.get(node)) {
                int adjNode = it.dist;
                int wt = it.node;
                if (d + wt < dist[adjNode]) {
                    dist[adjNode] = d + wt;
                    pq.add(new Pair(dist[adjNode], adjNode));
                    ways[adjNode] = ways[node];
                } else if (d + wt == dist[adjNode]) {
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }
        }
        return ways[n - 1] % mod;
    }
}

public class NumberofWaysToArriveAtDestination {

}
