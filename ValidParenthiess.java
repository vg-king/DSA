import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length()==0||s.length()==1) return false;

        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('||c=='{'||c=='[') {
                st.push(c);
            }
            if(!st.isEmpty()){
            if(st.peek()=='('&&c==')') st.pop();
            else if(st.peek()=='['&&c==']') st.pop();
            else if(st.peek()=='{'&&c=='}') st.pop();
            }
        }
        return st.isEmpty();
    }
}
public class ValidParenthiess {
    
}
