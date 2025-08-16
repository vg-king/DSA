import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class PSE {
    public List<Integer> findNSE(int arr[]){
        int n = arr.length;
        int nse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n-1; i++) {
            while (!st.isEmpty()&&st.peek()>=arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : nse) {
            result.add(num);
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
