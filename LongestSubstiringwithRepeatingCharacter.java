import java.util.Stack;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class LongestSubstiringwithRepeatingCharacter {
    
     public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mpp = new HashMap<>();
        int left = 0,right  =0;
        int n = s.length();
        int len = 0;
        while (right<n) {
            if (mpp.containsKey(s.charAt(right))) {
            left=Math.max(mpp.get(s.charAt(right))+1, left);
            
            } 
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;           
        }
        return len;
       }
    

    public static void main(String[] args) {
        
    }
}
