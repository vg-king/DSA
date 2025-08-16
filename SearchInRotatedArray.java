import java.util.Arrays;

public class SearchInRotatedArray {

    public static int binarySearch(int arr[], int size, int element) {
    int low = 0, high = size - 1, mid;

    // Start searching
    while (low <= high) {
        mid = (low + high) / 2;  // Calculate mid every loop iteration

        if (arr[mid] == element) {
            return mid;//after searching every number once happen mid==element then return mid
            
        }
        if (arr[mid] < element) {
            low = mid + 1; 
        } else {
            high = mid - 1;
        }
    }
    // Searching ends
    return -1;
}

    public static int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        while (low<=high) {
            int mid =  (low+high)/2;
            if (nums[mid]==target) {
                return mid;
            }
            if (nums[low]<=nums[mid]) {
                if (nums[low]<=target&&target<nums[mid]) {
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if (nums[mid]<target&&target<=nums[high]) {
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
       System.out.println( search(arr, 0));
    }
}
