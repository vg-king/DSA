public class MaxConsecutiveOnes3 {
     public int longestOnes(int[] nums, int k) {
 
        int maxLen=0;
        
        
        int i = 0;
        for (int j = i+1; j < nums.length; j++) {
            if (nums[j]==0) {
                k--;
            }
            while (k<0) {
                if (nums[i]==0) {
                    k++;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);

        }
        return maxLen;

    }
    public static void main(String[] args) {
        
    }
}
