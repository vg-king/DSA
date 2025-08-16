public class setMatrixToZero73 {
     public void setZeroes(int[][] matrix) {
     int colO = 1;
     int n = matrix.length;
     int m = matrix[0].length;
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j]==0) {
                matrix[i][0]=0;
                if (j!=0) {
                    matrix[0][j]=0;
                }
                else{
                    colO = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            for (int j2 = 1; j2 < m; j2++) {
                if (matrix[i][j]!=0) {
                    if (matrix[0][j]==0||matrix[i][0]==0) {
                        matrix[i][j]=0;
                    }
                }
            }
            
        }
        if (matrix[0][i]==0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j]=0;
            }
            
        }
        if (colO==0) {
            for (int j = 0; j < n; j++) {
                matrix[j][0]=0;
            }
        }
     }   
    }
    public static void main(String[] args) {
        
    }
    
}
