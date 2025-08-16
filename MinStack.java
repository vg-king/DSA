import java.util.Stack;

import javafx.util.Pair;
class MinStack {
    Stack<Pair<Integer,Integer>> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val,val);
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return 0;
       return st.pop();
    }
    
    public int getMin() {
        int arr[] = new int[st.size()];
        int i = 0;
       while (st.size()>0) {
        arr[i] = st.pop();
        i++;
       }
       if(arr.length == 0) return -2;
       int smallest = Integer.MIN_VALUE;
       for (int j = 0; j < arr.length; j++) {
        if (arr[j]<smallest) {
            smallest = arr[j];
        }
       }
       return smallest;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {
    public static void main(String[] args) {
        
    }
}
