import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Solution {
    class Color{
        int node;
        int color;
        Color(int node,int color){
            this.node = node;
            this.color = color;

        }
    }
   boolean bfs(int start,List<List<Integer>> adjList,int color[]){
    Queue<Color> queue=new LinkedList<>();
    color[start]=0;
    queue.add(new Color(start, 0));
    while (!queue.isEmpty()) {
        Color c = queue.poll();
        int node = c.node;
        for (int  i : adjList.get(node)) {
            if (color[i]==-1) {
                color[i]=1-color[node];
                queue.add(new Color(i, color[i]));
            }
            else if (color[i]==color[node]) {
                return false;
            }
        }
    }
    return true;
   }
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j]==1&&i!=j) {
                    adjList.get(i).add(j);

                }
            }
        }
        int color[] = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < color.length; i++) {
            if (color[i]==-1) {
                if (!bfs(i, adjList, color)) {
                    return false;
                }
            }
        }
        return true;

    }
}
public class isGraphBiparitite {
    
}
