import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
class Solution {
   List<Integer> bfs(int V,List<List<Integer>> adj){
    int inDegree[] = new int[V];
    for (int i = 0; i < V; i++) {
        for (int it : adj.get(i)) {
            inDegree[it]++;
        }
    }
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < V; i++) {
        if (inDegree[i]==0) {
            q.add(i);
        }
    }
    List<Integer> topo = new ArrayList<>();
    while (!q.isEmpty()) {
        int node = q.peek();
        q.remove();
        topo.add(node);
        for (int it : adj.get(node)) {
            inDegree[it]--;
            if (inDegree[it]==0 ) {
                q.add(it);
            }
        }
    }
    return topo;
   }
    public String findOrder(String[] words) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            adj.add(new ArrayList<>());

        }
        for (int i = 0; i < words.length-1; i++) {
            String a = words[i];
            String b = words[i+1];
            int len = Math.min(a.length(),b.length());
            for (int j = 0; j < len; j++) {
                if (a.charAt(j)!=b.charAt(j)) {
                    
                    adj.get(a.charAt(j)-'a').add(b.charAt(j)-'a');
                    break;
                }
            }

        }
        List<Integer> topo  = bfs(words.length, adj);
        String ans = "";
        for (int it : topo) {
            ans = ans+(char)(it+(int)('a'));
        }
        return ans;
    }
}
public class AlienDictionary {
    
}
