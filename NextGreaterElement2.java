import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
     
     int arr[] = new int[nums.length];
     Stack<Integer> st = new Stack<>();
     for(int i=nums.length-1;i<0;i++){
     while(!st.isEmpty()&&st.peek()<=nums[i]){
        st.pop();

     } 
     if(st.isEmpty()) arr[i]=-1;
     else arr[i] = st.peek();

     st.push(arr[i]);
     }  
     return arr;

    }
}
public class NextGreaterElement2 {
    public static void main(String[] args) {
        
    }
}
