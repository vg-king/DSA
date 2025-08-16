public class NextPermutation {
    public static void reverse(int [] arr,int left,int right){
       
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
     int ind = -1;
     int n = nums.length;
     int temp;
     for (int i = n-2; i >= 0; i--) {
        if (nums[i]<nums[i+1]) {
            ind = i;
            break;
        }
     }   
     for (int i = n-1; i < ind; i++) {
        if (nums[i]>nums[ind]) {
            temp = nums[i];
            nums[i] = nums[ind];
            nums[ind] = temp;
            break;
        }

     }
     reverse(nums,ind+1,n-1);

    }
    public static void main(String[] args) {
        
    }
}
