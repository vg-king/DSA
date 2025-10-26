
import java.util.Queue;
import java.util.LinkedList;
class Pair {
    int row;
    int col;
    int dis;
    Pair(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Queue<Pair> queue = new LinkedList<>();
        int[][] vis = new int[n][m];
        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new Pair(i, j, 0));
                    vis[i][j] = 1;
                }
            }
        }

        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            int r = p.row;
            int c = p.col;
            int d = p.dis;

            dist[r][c] = d;

            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    queue.add(new Pair(nrow, ncol, d + 1));
                }
            }
        }

        return dist;
    }
}
