import java.util.HashSet;
import java.util.Set;

public class LasrgestConseutiveInteger {
     public int longestConsecutive(int[] nums) {
     Set<Integer> st = new HashSet<>();
     for (Integer num : nums) {
        st.add(num);
     }   
     int largest = 1;
     for (Integer it : st) {
        if (!st.contains(it-1)) {
            int count = 1;
            int x = it;
            while (st.contains(x+1)) {
                x++;
                count++;
            }
            largest = Math.max(largest, count);
        }
     }
     return largest;
    }
    public static void main(String[] args) {
        
    }
}
