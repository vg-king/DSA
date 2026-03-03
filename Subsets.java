import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res,new ArrayList<>(),nums,0);
        return res;

    }

    void backTrack(List<List<Integer>> res, List<Integer> tempSet, int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);
            backTrack(res, tempSet, nums, i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
    
}