import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1<<n;
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subList.add(nums[j]);
                }
            }
            list.add(subList);
        }
    return list;
    }
}
public class PowerSubsets {
    public static void main(String[] args) {
        
    }
}
