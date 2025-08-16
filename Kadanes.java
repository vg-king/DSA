public class Kadanes {
    class Solution {
        public int maxSubArray(int[] nums) {
    
            int sum = 0;
            int maxi = Long.MIN_VALUE;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
    
                if (sum > maxi) {
                    maxi = sum;
                }
    
                if (sum < 0) {
                    sum = 0;
                }
            }
            return maxi;
    
        }
    }
    public static void main(String[] args) {
        
    }
}
