import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;

class Solution {
   class Tupple{
    int dis;
    int row;
    int col;
    Tupple(int dis,int row,int col){
        this.dis = dis;
        this.row = row;
        this.col = col;
    }
   }
    public int minimumEffortPath(int[][] heights) {
       PriorityQueue<Tupple> pq = new PriorityQueue<>((x,y)->x.dis-y.dis);
       int n = heights.length;
       int m = heights[0].length;
       int [][]dist = new int[n][m];
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            dist[i][j] = (int)(1e9);
        }
       }
       dist[0][0] = 0;
       pq.add(new Tupple(0, 0, 0));

       int dr [] = {-1,0,1,0};
       int dc [] = {0,1,0,-1};

       while (pq.size()!=0) {
        Tupple it  = pq.peek();
        pq.remove();
        int diff = it.dis;
        int row = it.row;
        int col = it.col;
        if (row==n-1&&col==m-1) {
            return diff;
        }
        for (int i = 0; i < 4; i++) {
            int nr = row+dr[i];
            int nc = col+dc[i];
            if (nr>=0&&nc>=0&&nr<n&&nc<m) {
                int newEffort = Math.max(
                    Math.abs(heights[row][col]-heights[nr][nc]),diff);
                if (newEffort<dist[nr][nc]) {
                    dist[nr][nc]=newEffort;
                    pq.add(new Tupple(newEffort, nr, nc));
                }
            }
        }
       }
       return 0;
    }
}

public class PathWithMinimumEffort {

}
