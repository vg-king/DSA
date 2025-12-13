// User function Template for Java
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row = row;
            this.col = col;
            
        }
    }

    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
       int vis[][] = new int[n][m];
       HashSet<ArrayList<String>> set = new HashSet<>();
       int drow[] = {-1,0,1,0};
       int dcol[] = {0,1,0,-1};

       for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j]==1&&vis[i][j]==0) {
                Queue<Pair> queue  = new LinkedList<>();
                queue.add(new Pair(i, j));
                vis[i][j] = 1;
                ArrayList<String> shape =  new ArrayList<>();
                int baseX = i;
                int baseY = j;
                while (!queue.isEmpty()) {
                    Pair p = queue.remove();
                    int r = p.row;
                    int c= p.col;
                    int dx = r-baseX;
                    int dy = c-baseY;
                    shape.add(dx+""+dy);
                    for (int k = 0; k < 4; k++) {
                        int nrow = r+drow[k];
                        int ncol = c+dcol[k];
                        if (nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]==1&&vis[nrow][ncol]==0) {
                            vis[nrow][ncol]=1;
                            queue.add(new Pair(nrow, ncol));
                        }
                    }
                }
                set.add(shape);
            }
        }
       }
       return set.size();
    }
}

public class countDistinctIslands {
    
}
