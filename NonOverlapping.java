import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class NonOverlapping {
    class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

         List<int []> list = new ArrayList<>();
         int count = 0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] i : intervals) {
            if (i[0]<=end) {
                end=Math.max(end,i[1]);
            }
            else{
                list.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }

        }
        list.add(new int[]{start,end});

     
    }
}
}
