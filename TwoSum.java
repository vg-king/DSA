import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    // public static String read(int n,List<Integer> book,int target){
    // Map<Integer,Integer> map = new HashMap<>();
    // for (int i = 0; i < n; i++) {
    // int a = book.get(i);
    // int more = target - a;

    // if (map.containsKey(more)) {
    // return "Yes";
    // }
    // map.put(a, 1);
    // }
    // return "no";
    // }
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

    }
}
