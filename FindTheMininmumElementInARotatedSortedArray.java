class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0,h=n-1;
        while (l<=h) {
            int mid = (l+h)/2;
            if(mid==nums.length-1) return nums[0];
            if (nums[mid+1]<nums[mid]) {
                return nums[mid+1];
            }
           else if (nums[mid-1]>nums[mid]) {
                return nums[mid];
            }
            else if (nums[mid+1]>nums[mid]) {
                l = mid+1;
            }
            else h=mid-1;
        }
        return 0;
    }
}
public class FindTheMininmumElementInARotatedSortedArray {
    
}
