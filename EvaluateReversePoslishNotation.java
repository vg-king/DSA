import java.util.Stack;



class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String c : tokens) {
            if (c.equals( "+")) {
                if (!st.isEmpty()) {
                    int i = st.pop();
                    int j = st.pop();
                    int ans = i + j;
                    st.push(ans);
                }
            } 
            else if (c.equals( "-")) {
                if (!st.isEmpty()) {
                    int i = st.pop();
                    int j = st.pop();
                    int ans = i - j;
                    st.push(ans);
                }
            }
             else if (c.equals( "/")) {
                if (!st.isEmpty()) {
                    int i = st.pop();
                    int j = st.pop();
                    int ans = i / j;
                    st.push(ans);
                }
            } 
            else if (c.equals( "/")) {
                if (!st.isEmpty()) {
                    int i = st.pop();
                    int j = st.pop();
                    int ans = i * j;
                    st.push(ans);
                }
            }
            else{
               st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}

public class EvaluateReversePoslishNotation {

}
