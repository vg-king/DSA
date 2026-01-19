import java.util.Stack;

class MinStack {

    Stack<Integer> st ;
    Stack<Integer> st1 ;
    public MinStack() {
        st = new Stack<>();
        st1 = new Stack<>();
    }
    
    public void push(int val) {
        st1.push(val);
       if(st.isEmpty()||st.peek()>=val) st.push(val);
    }
    
    public void pop() {
        int remove = st.pop();
        if(!st.isEmpty()&&st.peek() == remove) st.pop();
    }
    
    public int top() {
      return  st1.peek();
    }
    
    public int getMin() {
        
        return st.peek();
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
public class MinStackk {
    
}
