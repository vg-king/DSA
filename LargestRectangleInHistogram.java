import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights.length==1) {
            return heights[0];
        }
        
        if (heights.length==0) {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        int sum=0,maxSum=0;
        for (int i = 0; i < heights.length-1; i++) {
            st.push(heights[i]);
            int min=0;
           if(!st.isEmpty()){
             min = Math.min(st.peek(),heights[i+1]);
           }
           sum=2*min;
           maxSum = Math.max(sum,maxSum);

        }
        return maxSum;
        
    }
}
public class LargestRectangleInHistogram {
    
}
