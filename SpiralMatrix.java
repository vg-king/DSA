import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> sprialMatrix(int matrix[][]){
      List<Integer>list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0,right=m-1,top=0,bottom = n-1;
        while (top<=bottom&&left<=right) {
            
        
        //Traverse Right
        for (int i = left; i <= right; i++) {
            list.add(matrix[top][i]);
        }
        top++;
        //Traverse down
        for (int i = top; i <=bottom; i++) {
            list.add(matrix[i][right]);
        }
        right--;
        //Traverse left
        if (top<=bottom) {
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            
        }
        //Traverse up
        if (left<=right) {
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
    }
        return list;
}
    public static void main(String[] args) {
        
    }
}
