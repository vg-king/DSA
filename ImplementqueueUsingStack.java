import java.util.Stack;

class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    Stack<Integer> st3;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
        st3 = new Stack<>();
    }
    
    public void reverse(Stack<Integer> st1){
          while(st1.size()>0){
            st2.push(st1.pop());
        }
        while (st2.size()>0) {
            st3.push(st2.pop());
        }
        while (st3.size()>0) {
            st1.push(st3.pop());
        }
    }
    public void push(int x) {
        st1.push(x);
       

    }
    
    public int pop() {
        reverse(st1);
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.pop();
    }
    
    public int peek() {
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.peek();
    }
    
    public boolean empty() {
        if (st1.isEmpty()) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class ImplementqueueUsingStack {
    public static void main(String[] args) {
        
    }
}
