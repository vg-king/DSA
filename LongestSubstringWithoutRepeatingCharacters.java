import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,r=1,maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        while (r<s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                maxLength = Math.max(maxLength, r-l+1);
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }

        }
        return maxLength;
    }
}
public class LongestSubstringWithoutRepeatingCharacters {
    
}
