import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

class Solution {

    class DisjointSet {
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();

        public DisjointSet(int n) {
            for (int i = 0; i <= n; i++) {
                rank.add(0);
                parent.add(i);
                size.add(1);
            }
        }

        public int findUPar(int node) {
            if (node == parent.get(node)) {
                return node;
            }
            int ulp = findUPar(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }

        public void unionByRank(int u, int v) {
            int ulp_u = findUPar(u);
            int ulp_v = findUPar(v);
            if (ulp_u == ulp_v)
                return;
            if (rank.get(ulp_u) < rank.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
            } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
                parent.set(ulp_v, ulp_u);
            } else {
                parent.set(ulp_v, ulp_u);
                int rankU = rank.get(ulp_u);
                rank.set(ulp_u, rankU + 1);
            }
        }

        public void unionBySize(int u, int v) {
            int ulp_u = findUPar(u);
            int ulp_v = findUPar(v);
            if (ulp_u == ulp_v)
                return;
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
            }
        }
    }

    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;

        }
    }

    public List<Integer> numOfIslands(int n, int m, int[][] A) {
        
        int arr[][] = new int[n][m];
        Arrays.fill(arr, 0);
        for (int i = 0; i < A.length; i++) {
            int row = A[i][0];
            int col = A[i][1];
            // if (arr[row][col] == 0) {
                // arr[row][col] = 1;
                // }
                arr[row][col] = 1;
                
            }
            Queue<Pair> queue = new LinkedList<>();
            int vis[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                    queue.add(new Pair(i, j));
                    vis[i][j] = 1;

                }
            }
        }
        int drow[] = { -1, 0, 1, 0 };
        int dcol[] = { 0, 1, 0, -1 };
        DisjointSet ds = new DisjointSet(A.length);
        List<Integer> ans = new ArrayList<>();
        int count=0;
        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            int r = p.row;
            int c = p.col;
            for (int i = 0; i < 4; i++) {
                count=1;
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && arr[nrow][ncol] == 1) {
                    queue.add(new Pair(nrow, ncol));
                    ds.unionBySize(nrow,ncol);
                    if(ds.findUPar(i)!=ds.findUPar(nrow)||ds.findUPar(i)!=ds.findUPar(ncol)){
                        count++;
                    }
                    ans.add(count);
                    vis[nrow][ncol] = 1;

                }
            }
        }
        return ans;
    }
}

public class NoOfIslands_2 {

}
