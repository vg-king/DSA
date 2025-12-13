
class Pair implements Comparable<Pair> {
    int dist;
    int node;
    
    Pair(int dist, int node) {
        this.dist = dist;
        this.node = node;
    }
    
    @Override
    public int compareTo(Pair other) {
        if(this.dist != other.dist) {
            return Integer.compare(this.dist, other.dist);
        } else {
            return Integer.compare(this.node, other.node);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return this.dist == pair.dist && this.node == pair.node;
    }
}

class Solution
{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        TreeSet<Pair> st = new TreeSet<>();
        
        int[] dist = new int[V];
        for(int i=0; i<V; i++) {
            dist[i] = (int) 1e9;
        }
        
        
        dist[S] = 0;
        st.add(new Pair(0, S));
        
        while(st.size() > 0) {
            Pair curr = st.pollFirst();
            int currNode = curr.node;
            int currDist = curr.dist;
            
            for(List<Integer> adjacent : adj.get(currNode)) {
                int adjNode = adjacent.get(0);
                int adjDist = adjacent.get(1);
                
                if(dist[currNode] + adjDist < dist[adjNode]) {
                    if(dist[adjNode] != 1e9) st.remove(new Pair(dist[adjNode], adjNode));
                    
                    dist[adjNode] = dist[currNode] + adjDist;
                    st.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        
        return dist;
    }
}
public class DijkstraSet {
    
}
