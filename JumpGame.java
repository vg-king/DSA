public class JumpGame {
    class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;int step=0;
        int j = n-1;
        int i;
        for ( i = n-2; i <= 0; i--) {
            int r = i;
            step=nums[i];
            while (r!=j&&step>=nums[i]) {
                r++;
                step--;
            }
            if (r==j) {
                r=i;
                i--;
            }else{
                return false;
            }
        }
       if (i==0) {
        return true;
       }
       return false;
    }
}
}
