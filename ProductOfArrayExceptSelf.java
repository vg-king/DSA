class Solution {
    int product(int start,int end,int nums[]){
        int ans = 1;
        for (int i = start; i <= end; i++) {
            ans *= nums[i];
        }
        return ans;
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1]*nums[i-1];
        }
        int postfix=1;
        for (int i = n-1; i >=1; i--) {
            arr[i] *= postfix;
            postfix *= nums[i];  
        }
        return arr;

    }
}
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int ans= 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            ans=0;
            if (i==j) {
                continue;
            }
            ans*=j;
            arr[i] = ans;
        }
        return arr;
    }
}
