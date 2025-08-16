import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('||c=='['||c=='{') {
                st.push(c);
            }else {
                if (st.isEmpty()) {
                    return false;
                }
                char a = st.peek();
                if (a=='('&&c==')'||a=='['&&c==']'||a=='{'&&c=='}') {
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
        
    }
    

}
public class ValidParenthese {
    public static void main(String[] args) {
       String s = "()";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}
