class Solution {
    class Pair{
        int dist;
        int node;
        Pair(int dist,int node){
            this.dist = dist;
            this.node = node;


        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
            for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int wt = e[2];

            adj.get(u).add(new int[]{v, wt});
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        
        dist[k] = 0;
        pq.add(new Pair(0, k));

         while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int d = p.dist;
            int node = p.node;

            for (int[] neigh : adj.get(node)) {
                int adjNode = neigh[0];
                int wt = neigh[1];

                if (d + wt < dist[adjNode]) {
                    dist[adjNode] = d + wt;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        int lar = 0;

        for(int i =0;i<=dist.length;i++){
            if(i==-1) return -1;
            if(dist[i]>lar) lar= dist[i];
        }
        return lar;

    }
}
public class NetworkDelayTime {
    
}
