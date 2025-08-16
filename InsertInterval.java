import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list =  new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while (i<n&&intervals[i][1]<newInterval[0]) {
            list.add(intervals[i][1]);
            i++;
        }
        while (i<n&&intervals[i][0]<newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval, intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        while (i<1) {
            list.add(newInterval[i]);
            i++;
        }
        return intervals;
    }
}
    public static void main(String[] args) {
        
    }
}
