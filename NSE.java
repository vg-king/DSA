import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class NSE {
    public List<Integer> findNextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        // Convert array to List<Integer> before returning
        List<Integer> result = new ArrayList<>();
        for (int num : nse) {
            result.add(num);
        }
        return result;
    }


    public static void main(String[] args) {
        
    }
}
