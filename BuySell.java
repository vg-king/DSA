public class BuySell {
    class Solution {
        public int maxProfit(int[] prices) {
            int min = prices[0];
            int profit = 0;
            int cost = 0;
            int n = prices.length;
            for(int i = 0;i<n;i++){
                cost = prices[i] - min;
                profit  = Math.max(profit,cost);
                min = Math.min(min,prices[i]);
            }
            return profit;
        }
    }
    public static void main(String[] args) {
        
    }
}
