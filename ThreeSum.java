import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    class Solution {
        
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            for (int k = 0; k < nums.length-2; k++) {
                if(k>0&&nums[k]==nums[k-1]) continue;
                int target = -nums[k];
                int i = k+1,j=nums.length-1;
                while (i<j) {
                    int sum = nums[i]+nums[j];
                    if(sum==target){
                        result.add(Arrays.asList(nums[k],nums[i],nums[j]));
                        while(i<j&&nums[i]==nums[i+1])i++;
                        while(i<j&&nums[j]==nums[j-1])j--;
                        i++;
                        j--;
                    }
                    else if(sum<target) i++;
                    else j--;
                }
            }
            return result;
        }
    }

}