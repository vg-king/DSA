class Solution {
    public int maxProfit(int[] prices) {
        int l =0,r=1,profit = 0,maxProft=0;
        int n = prices.length;
        for ( r = l; r < prices.length; r++) {
            
        
            if (prices[r]<prices[l]) {
                l++;
            }
            r++;
            profit = r-l;
            maxProft = Math.max(maxProft, profit);
        }
        return maxProft;
    }
}
public class Buy_AND_Sell {
    
}
