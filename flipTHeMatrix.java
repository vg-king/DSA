public class flipTHeMatrix {
 class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int temp;
        int n = grid.length;
        for(int i= x;i<=k;i++){
            for(int j = y;j<=k;j++){
                temp = grid[i][j];
                grid[i][j] = grid[i][n-1];
                grid[i][n-1] = temp;
                
                
            }
        }
        return grid;
    }
}   
}
