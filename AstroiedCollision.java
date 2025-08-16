import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty()&&i<0&&st.peek()>0) {
                if (st.peek()<-i) {
                    st.pop();
                }else if (st.peek()==i) {
                    st.pop();
                    destroyed=true;
                    break;
                }else{
                    destroyed=true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(i);
            }

        }
        int arr[] = new int[st.size()];
        for (int i = arr.length-1; i >=0; i--) {
            arr[i]=st.pop();
        }
        return arr;
    }
}
public class AstroiedCollision {
    public static void main(String[] args) {
        
    }
}
