import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
       int i = 0,j=0,maxLen = 0,maxf = 0;
       Map<Character,Integer> mpp = new HashMap<>();
       for ( j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        mpp.put(c, mpp.getOrDefault(c, 0)+1);
        maxf = Math.min(maxf, mpp.get(c));
        if ((j-i+1)-maxf>k) {
            char ci = s.charAt(i);
            mpp.put(ci, mpp.get(ci)-1);
            i++;
        }
        maxLen = Math.max(maxLen, j-i+1);
       }
       return maxLen;

    }
    public static void main(String[] args) {
        
    }
}
