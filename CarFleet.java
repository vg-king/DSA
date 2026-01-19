import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int time[] = new int[position.length];
        Arrays.sort(position);
        for (int i = 0; i < position.length; i++) {
            time[i] = (target-position[i])/speed[i];
        }   
        Stack<int[]> st = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            st.push(new int[]{position[i],time[i]});
        }
        int sameFleet=0;
        while (!st.isEmpty()) {
           int t = st.pop()[1];
           if (st.peek()[1]<= t) {
            sameFleet++;
           }
        }
        return sameFleet;
    }
}
public class CarFleet {
    
}
