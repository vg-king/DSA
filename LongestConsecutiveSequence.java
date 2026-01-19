import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int longest=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1) count++;
            longest = Math.max(longest, count);
            count=1;
            

        }
        return Math.max(longest, count);
    }
}
public class LongestConsecutiveSequence {
    
}
