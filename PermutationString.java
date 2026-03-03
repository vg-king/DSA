import java.util.HashSet;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        int j=0;
        char ch[] = s2.toCharArray();

        for (char c : ch) {
            if (ch[c]==set.contains(c)) {
                j = c+1;
                while (ch[j]==set.contains(j)) {
                    j++;
                }
            }
            
            if ((j-c+1)==s1.length()) {
                return true;
            }
            return false;
        }
    }
}
public class PermutationString {
    
}
