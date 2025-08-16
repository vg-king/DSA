import java.util.HashMap;
import java.util.Map;

public class countSubArray {
     public int subarraySum(int[] nums, int k) {
     Map<Integer,Integer> map = new HashMap<>();   
     map.put(0, 1);
     int preSum = 0;
     int count = 0;
     int n = nums.length;
     for (int i = 0; i < n; i++) {
        preSum+=nums[i];
        int remove = preSum-k;
        count+=map.getOrDefault(remove, 0);
        map.put(preSum, map.getOrDefault(preSum, 0)+1);

     }
     return count;
    }

    public static void main(String[] args) {
        
    }
}
