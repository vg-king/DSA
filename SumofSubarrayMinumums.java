import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
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
    public List<Integer> findPSEE(int arr[]){
        int n = arr.length;
        int psee[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (st.isEmpty()&&arr[st.peek()]>arr[i]) {
                psee[i] = st.isEmpty()?-1:st.peek();
                st.push(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : psee) {
            result.add(num);
        }
        return result;
    }
    public int sumSubarrayMins(int[] arr) {
        List<Integer> nse =  new ArrayList<>();
        List<Integer> pse =  new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            int Left  = i-pse;
            int right  = nse[i]-i;
        }
        int total = (total+right*left*1(arr[i]));
        return total;
        
    }
}
public class SumofSubarrayMinumums {
    public static void main(String[] args) {
        
    }
}
