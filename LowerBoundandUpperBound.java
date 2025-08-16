public class LowerBoundandUpperBound {
    class Solution {
    public int lowerBound(int[] nums, int target) {
        int n = nums.length; 
       int low = 0,high = n-1;
       int mid;
       int ans = n;
       while(low<=high){
        mid = (low+high)/2;
        if(nums[mid]>=target){
            ans = mid;
            high = mid-1;
        }
        else{
            low = mid+1;
        }
       }
     return ans;
     
}
    public int UpperBound(int[] nums, int target) {
        int n = nums.length; 
       int low = 0,high = n-1;
       int mid;
       int ans = n;
       while(low<=high){
        mid = (low+high)/2;
        if(nums[mid]>target){
            ans = mid;
            high = mid-1;
        }
        else{
            low = mid+1;
        }
       }
     return ans;

}
public int[] searchRange(int[] nums, int target) {
    int noArr[] = {-1,-1};
        int lb = lowerBound(nums, target);
        if (lb==nums.length||nums[lb]!=target) {
            return noArr;
        }
        int up = UpperBound(nums, target);
        return new int[]{lb,up-1};

    }
}


//FirstandLast range of array

    public static void main(String[] args) {
        
    }
}
