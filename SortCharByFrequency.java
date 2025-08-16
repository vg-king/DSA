public class SortCharByFrequency {
    class Solution {
    public String frequencySort(String s) {
        char []c = new char[s.length()];
        
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                char c2 = s.charAt(j);
                if (c1==c2) {
                    count++;
                }
                else{
                    count=0;
                }
            }
            if (count>0) {
                c[i] = c1;
            }else if (count==0) {
                c[i] = c1;
            }
        }
        return new String(c);
    }
}
    public static void main(String[] args) {
        
    }
}
