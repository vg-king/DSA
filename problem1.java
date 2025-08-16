import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class problem1 {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
    
        int n = nums.length;
        k = k%n;
        reverse(nums,nums+k);
        reverse(num+d,nums+n);
        reverse(nums, nums+n);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}