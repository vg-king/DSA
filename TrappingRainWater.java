import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        st.contains(9);
        if(height==null||height.length==0) return 0;
        int l=0,r=height.length-1;
        int leftMax= height[l],ritghtMax = height[r];
        int res = 0;
        while (l<r) {
            if (leftMax<ritghtMax) {
                l++;
                leftMax=Math.max(leftMax, height[l]);
                res+=leftMax-height[l];
            }
            else{
                r--;
                ritghtMax = Math.max(ritghtMax, height[r]);
                res+=ritghtMax-height[r];
            }
        }
        return res;
    }
}
public class TrappingRainWater {
    
}
