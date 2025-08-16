import java.util.Arrays;

public class Permutation {

    // Recursive function to generate permutations
    static void permute(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));  // One permutation found
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);              // Swap current index with i
                permute(arr, l + 1, r);       // Recurse
                swap(arr, l, i);              // Backtrack
            }
        }
    }

    // Helper function to swap two elements in an array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums, 0, nums.length - 1);
    }
}
