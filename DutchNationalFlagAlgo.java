public class DutchNationalFlagAlgo {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int temp;
        int low = 0,mid=0,high = n-1;
        while (mid<=high) {
            if (nums[mid]==0) {
                temp = nums[low];
                nums[low]=nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
