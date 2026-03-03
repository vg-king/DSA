import java.util.Arrays;

class Solution{
    public int Nbowls(int arr[],int n){
        for (int i = n-1; i >= 0; i--) {
            if (arr[i]<9) return i+1;
        }
        return 0;
    }
    public int area(int arr[][]) {
        
        if (arr.length == 0) return 0;
        
        // Step 1: Sort by start
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        
        int total = 0;
        int start = arr[0][0];
        int end = arr[0][1];
        
        for (int i = 1; i < arr.length; i++) {
            
            // If overlapping
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } 
            // If not overlapping
            else {
                total += (end - start);
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        
        // Add last interval
        total += (end - start);
        
        return total;
    }

}

public class HighRadius {
    
}
