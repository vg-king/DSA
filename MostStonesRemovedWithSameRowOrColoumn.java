import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public void bfs(int i,ArrayList<ArrayList<Integer>> adj,boolean vis[]) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[i] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }

        
    }

    public int removeStones(int[][] stones) {
        int n = stones.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stones[i][0] == stones[j][0] ||
                        stones[i][1] == stones[j][1]) {

                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }


        }
        boolean vis[] = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                components++;
                bfs(i,adj,vis);
            }
        }
       return n - components;
    }
}

public class MostStonesRemovedWithSameRowOrColoumn {

}
