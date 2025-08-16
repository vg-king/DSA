public class LargestOddNOInString {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        int common = 0;
        for (int i = 0; i < strs.length; i++) {
            for (int j = i+1; j < strs.length; j++) {
                String s = strs[i];
                String q = strs[j];
                if (s.substring(0,i) == q.substring(0,j)) {
                    common++;
                }
            }
        }
        if (common==strs.length) {
            rt
        }
    }
}

    public static void main(String[] args) {
        String n = "Fsdf";
        
    }
}
