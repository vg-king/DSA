import java.util.Arrays;

public class SJF {
    class Solution {
    public long solve(int[] bt) {
        Arrays.sort(bt);
        int sum=0;
        int totalSum = 0;
        for (int i = 0; i < bt.length; i++) {
            sum+=bt[i+1];
            totalSum = bt[i]+sum;
        }
        int avg = totalSum/bt.length;
        return avg;
    }
}
    public static void main(String[] args) {
        
    }
}
