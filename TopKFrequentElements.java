import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        List<Integer>[]freq = new List[nums.length+1];

        for (int i : nums) {
            mpp.put(i, mpp.getOrDefault(i, 0)+1);
        }
         for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        int res [] = new int[k];
        int index=0;
        for (int i = freq.length-1; i >0&&index<k; i--) {
            for (int n : freq[i]) {
                res[index++]=n;
                if (index==k) {
                    return res;
                }
            }
        }
        return res;
    }

}
public class TopKFrequentElements {
    
}
