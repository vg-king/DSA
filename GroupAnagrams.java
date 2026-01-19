import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import        java.util.List;
import java.util.Map;

class Solution {
   

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String st = new String(c);
            res.putIfAbsent(st, new ArrayList<>());
            res.get(st).add(s);
        }
        return new ArrayList<>(res.values());
    }
}