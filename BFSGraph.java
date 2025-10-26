import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)) {
                if (vis[it]==false) {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }
        
        return bfs;
    }
}
public class BFSGraph {
    
}
