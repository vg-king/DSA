import java.util.Arrays;

public class AssignCookies {
      public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);Arrays.sort(g);
        int count=0;
        int j = 0,i=0;
        while (i<g.length&&j<s.length) {
            if (s[j]>=g[i]) {
                i++;
                count++;
            }
            j++;

        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}