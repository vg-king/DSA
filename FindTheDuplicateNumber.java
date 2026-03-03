import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> occur = new HashSet<>();
        for (int i : nums) {
            if (occur.contains(i)) {
                return i;
            }
            occur.add(i);
        }
        return 0;
        
    }
}
public class FindTheDuplicateNumber {
    
}
