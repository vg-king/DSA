import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class NGE {
    public List<Integer> findNextGreaterElement(int arr[]) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        // Convert array to List<Integer> before returning
        List<Integer> result = new ArrayList<>();
        for (int num : nge) {
            result.add(num);
        }
        return result;
    }
    
    public static void main(String[] args) {
        
    }
    
    
}