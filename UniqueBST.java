public class UniqueBST {
    class Solution {
    public int numTrees(int n) {
        int g[] = new int[n];
        g[0] = 1;
        g[n] = n;
        int ans=0;
        for(int i = 0;i<n;i++){
            ans = g[i-1]*g[n-i];
        }
        return ans;
    }
} 
public static void main(String[] args) {
    
}
}
